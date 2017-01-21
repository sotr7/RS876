package com.jagex;

import com.jagex.Class148;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class229;
import com.jagex.Class230;
import com.jagex.Class32;
import com.jagex.Class4;
import com.jagex.Class40_Sub8;
import com.jagex.Class437;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class463;
import com.jagex.Class493;
import com.jagex.Class516;
import com.jagex.Class526_Sub18;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.Class570;
import com.jagex.Class593;
import com.jagex.Class594;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub3;
import com.jagex.Class681;
import com.jagex.Interface59;
import com.jagex.client;

public class Class639_Sub1_Sub3_Sub1 extends Class639_Sub1_Sub3 implements Interface59 {
   boolean aBool12012;
   Class550 aClass550_12007;
   Class526_Sub21_Sub5 aClass526_Sub21_Sub5_12006;
   Class40_Sub8 aClass40_Sub8_12005;
   int anInt12008;
   boolean aBool12010;
   byte aByte12013;
   boolean aBool12009;
   boolean aBool12004;
   Class168 aClass168_12011;

   public int method130() {
      return 1080039219 * this.anInt12008;
   }

   public int method56(int var1) {
      return 1080039219 * this.anInt12008;
   }

   boolean method9822(int var1) {
      return this.aClass168_12011 != null?this.aClass168_12011.method2014():false;
   }

   public int method9832(byte var1) {
      return null != this.aClass168_12011?this.aClass168_12011.method1981():0;
   }

   void method9842(int var1) {
      this.aBool12012 = false;
      if(this.aClass168_12011 != null) {
         this.aClass168_12011.method2110(this.aClass168_12011.method2101() & -65537);
      }

   }

   Class4 method10845(Class174 var1, int var2, boolean var3, int var4) {
      Class610 var5 = (Class610)this.aClass40_Sub8_12005.method89(1080039219 * this.anInt12008, -898081847);
      Class148 var6;
      Class148 var7;
      if(this.aBool12010) {
         var6 = this.aClass549_10826.aClass148Array7292[this.aByte10828];
         var7 = this.aClass549_10826.aClass148Array7290[0];
      } else {
         var6 = this.aClass549_10826.aClass148Array7290[this.aByte10828];
         if(this.aByte10828 < 3) {
            var7 = this.aClass549_10826.aClass148Array7290[1 + this.aByte10828];
         } else {
            var7 = null;
         }
      }

      Class446 var8 = this.method7635().aClass446_4816;
      return var5.method7176(var1, var2, -1226971375 * Class594.aClass594_7843.anInt7833, this.aByte12013, var6, var7, (int)var8.aFloat4917, (int)var8.aFloat4915, (int)var8.aFloat4919, var3, (Class599)null, -241290772);
   }

   public Class550 method9827(Class174 var1, int var2) {
      Class446 var3 = this.method7635().aClass446_4816;
      if(this.aClass550_12007 == null) {
         this.aClass550_12007 = Class625.method7449((int)var3.aFloat4917, (int)var3.aFloat4915, (int)var3.aFloat4919, this.method10847(var1, 0, (byte)1), -1317090454);
      }

      return this.aClass550_12007;
   }

   public boolean method380(byte var1) {
      return this.aBool12004;
   }

   void method9834(Class174 var1, int var2) {
   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class437 var5 = ((Class610)this.aClass40_Sub8_12005.method89(this.anInt12008 * 1080039219, -1823925230)).aClass437_8007;
      if(var5 != null) {
         return var1.method2301(var2, var3, this.method7623(), var5, -2001080155);
      } else {
         Class168 var6 = this.method10847(var1, 131072, (byte)1);
         if(var6 != null) {
            Class445 var7 = this.method7623();
            return var6.method1975(var2, var3, var7, false, 0);
         } else {
            return false;
         }
      }
   }

   boolean method9864(byte var1) {
      return this.aBool12012;
   }

   void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var2 instanceof Class639_Sub1_Sub3_Sub1) {
         Class639_Sub1_Sub3_Sub1 var8 = (Class639_Sub1_Sub3_Sub1)var2;
         if(this.aClass168_12011 != null && null != var8.aClass168_12011) {
            this.aClass168_12011.method1999(var8.aClass168_12011, var3, var4, var5, var6);
         }
      }

   }

   public boolean method387() {
      return true;
   }

   public int method139() {
      return Class594.aClass594_7843.anInt7833 * -1226971375;
   }

   public int method87(int var1) {
      return Class594.aClass594_7843.anInt7833 * -1226971375;
   }

   boolean method9821(int var1) {
      return this.aClass168_12011 != null?!this.aClass168_12011.method1953():true;
   }

   public void method388(int var1) {
      if(null != this.aClass168_12011) {
         this.aClass168_12011.method1950();
      }

   }

   public boolean method384(byte var1) {
      return true;
   }

   Class555 method9828(Class174 var1) {
      if(null == this.aClass168_12011) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool12009, (short)19745);
         Class437 var4 = ((Class610)this.aClass40_Sub8_12005.method89(1080039219 * this.anInt12008, 46523148)).aClass437_8007;
         if(null != var4) {
            this.aClass168_12011.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_12011.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   Class4 method10846(Class174 var1, int var2, boolean var3) {
      Class610 var4 = (Class610)this.aClass40_Sub8_12005.method89(1080039219 * this.anInt12008, -742056540);
      Class148 var5;
      Class148 var6;
      if(this.aBool12010) {
         var5 = this.aClass549_10826.aClass148Array7292[this.aByte10828];
         var6 = this.aClass549_10826.aClass148Array7290[0];
      } else {
         var5 = this.aClass549_10826.aClass148Array7290[this.aByte10828];
         if(this.aByte10828 < 3) {
            var6 = this.aClass549_10826.aClass148Array7290[1 + this.aByte10828];
         } else {
            var6 = null;
         }
      }

      Class446 var7 = this.method7635().aClass446_4816;
      return var4.method7176(var1, var2, -1226971375 * Class594.aClass594_7843.anInt7833, this.aByte12013, var5, var6, (int)var7.aFloat4917, (int)var7.aFloat4915, (int)var7.aFloat4919, var3, (Class599)null, -789292493);
   }

   public void method381(Class174 var1, byte var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var4 = this.method10845(var1, 262144, true, -1858591536);
         var3 = (Class526_Sub21_Sub5)(var4 != null?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(null != var3) {
         this.aClass549_10826.method6601(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, (byte)-12);
      }

   }

   public int method9() {
      return 1080039219 * this.anInt12008;
   }

   public int method137() {
      return 1080039219 * this.anInt12008;
   }

   public void method382(Class174 var1, int var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var4 = this.method10845(var1, 262144, true, -1858591536);
         var3 = (Class526_Sub21_Sub5)(var4 != null?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(var3 != null) {
         this.aClass549_10826.method6595(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, 658724942);
      }

   }

   public Class550 method9829(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12007 == null) {
         this.aClass550_12007 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10847(var1, 0, (byte)1), -1122245668);
      }

      return this.aClass550_12007;
   }

   public int method394() {
      return this.aByte12013;
   }

   public void method386() {
      if(null != this.aClass168_12011) {
         this.aClass168_12011.method1950();
      }

   }

   public boolean method385() {
      return this.aBool12004;
   }

   public boolean method265() {
      return this.aBool12004;
   }

   public Class550 method9856(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12007 == null) {
         this.aClass550_12007 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10847(var1, 0, (byte)1), -1459715420);
      }

      return this.aClass550_12007;
   }

   public boolean method378() {
      return true;
   }

   public void method389(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var3 = this.method10845(var1, 262144, true, -1858591536);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, 165520638);
      }

   }

   public void method390(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var3 = this.method10845(var1, 262144, true, -1858591536);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, 359023637);
      }

   }

   public void method391(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var3 = this.method10845(var1, 262144, true, -1858591536);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)-6);
      }

   }

   public int method379(byte var1) {
      return this.aByte12013;
   }

   Class555 method9858(Class174 var1) {
      if(null == this.aClass168_12011) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool12009, (short)20559);
         Class437 var4 = ((Class610)this.aClass40_Sub8_12005.method89(1080039219 * this.anInt12008, -458529202)).aClass437_8007;
         if(null != var4) {
            this.aClass168_12011.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_12011.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   public void method383(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var3 = this.method10845(var1, 262144, true, -1858591536);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)97);
      }

   }

   boolean method9836() {
      return this.aClass168_12011 != null?!this.aClass168_12011.method1953():true;
   }

   boolean method9841() {
      return this.aClass168_12011 != null?this.aClass168_12011.method2014():false;
   }

   public int method9838() {
      return null != this.aClass168_12011?this.aClass168_12011.method1981():0;
   }

   Class555 method9825(Class174 var1, int var2) {
      if(null == this.aClass168_12011) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class555 var4 = Class463.method5475(this.aBool12009, (short)11263);
         Class437 var5 = ((Class610)this.aClass40_Sub8_12005.method89(1080039219 * this.anInt12008, -87560033)).aClass437_8007;
         if(null != var5) {
            this.aClass168_12011.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5);
         } else {
            this.aClass168_12011.method1974(var3, this.aClass164Array10829[0], 0);
         }

         return var4;
      }
   }

   public Class550 method9840(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12007 == null) {
         this.aClass550_12007 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10847(var1, 0, (byte)1), -2113396901);
      }

      return this.aClass550_12007;
   }

   Class168 method10847(Class174 var1, int var2, byte var3) {
      if(null != this.aClass168_12011 && var1.method2464(this.aClass168_12011.method2101(), var2) == 0) {
         return this.aClass168_12011;
      } else {
         Class4 var4 = this.method10845(var1, var2, false, -1858591536);
         return var4 != null?(Class168)var4.anObject23:null;
      }
   }

   public void method393(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var3 = this.method10845(var1, 262144, true, -1858591536);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)69);
      }

   }

   public void method392(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12006 && this.aBool12004) {
         Class4 var3 = this.method10845(var1, 262144, true, -1858591536);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12006;
         this.aClass526_Sub21_Sub5_12006 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)12);
      }

   }

   public int method9833() {
      return null != this.aClass168_12011?this.aClass168_12011.method1981():0;
   }

   Class168 method10848(Class174 var1, int var2) {
      if(null != this.aClass168_12011 && var1.method2464(this.aClass168_12011.method2101(), var2) == 0) {
         return this.aClass168_12011;
      } else {
         Class4 var3 = this.method10845(var1, var2, false, -1858591536);
         return var3 != null?(Class168)var3.anObject23:null;
      }
   }

   Class555 method9844(Class174 var1) {
      if(null == this.aClass168_12011) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool12009, (short)8390);
         Class437 var4 = ((Class610)this.aClass40_Sub8_12005.method89(1080039219 * this.anInt12008, -902481997)).aClass437_8007;
         if(null != var4) {
            this.aClass168_12011.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_12011.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   void method9848(Class174 var1) {
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class437 var4 = ((Class610)this.aClass40_Sub8_12005.method89(this.anInt12008 * 1080039219, -1872192846)).aClass437_8007;
      if(var4 != null) {
         return var1.method2301(var2, var3, this.method7623(), var4, -989906735);
      } else {
         Class168 var5 = this.method10847(var1, 131072, (byte)1);
         if(var5 != null) {
            Class445 var6 = this.method7623();
            return var5.method1975(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      }
   }

   public Class550 method9843(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12007 == null) {
         this.aClass550_12007 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10847(var1, 0, (byte)1), -123797791);
      }

      return this.aClass550_12007;
   }

   boolean method9851() {
      return this.aBool12012;
   }

   void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      if(var2 instanceof Class639_Sub1_Sub3_Sub1) {
         Class639_Sub1_Sub3_Sub1 var7 = (Class639_Sub1_Sub3_Sub1)var2;
         if(this.aClass168_12011 != null && null != var7.aClass168_12011) {
            this.aClass168_12011.method1999(var7.aClass168_12011, var3, var4, var5, var6);
         }
      }

   }

   void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      if(var2 instanceof Class639_Sub1_Sub3_Sub1) {
         Class639_Sub1_Sub3_Sub1 var7 = (Class639_Sub1_Sub3_Sub1)var2;
         if(this.aClass168_12011 != null && null != var7.aClass168_12011) {
            this.aClass168_12011.method1999(var7.aClass168_12011, var3, var4, var5, var6);
         }
      }

   }

   void method9847() {
      this.aBool12012 = false;
      if(this.aClass168_12011 != null) {
         this.aClass168_12011.method2110(this.aClass168_12011.method2101() & -65537);
      }

   }

   public Class639_Sub1_Sub3_Sub1(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, boolean var12) {
      super(var1, var7, var8, var9, var5, var6, 1010119415 * var4.anInt7988);
      this.aClass40_Sub8_12005 = var3;
      this.anInt12008 = 137344639 * var4.anInt7959;
      this.aBool12010 = var10;
      this.aByte12013 = (byte)var11;
      this.aBool12009 = 0 != var4.anInt7954 * 909601847 && !var10;
      this.aBool12012 = var12;
      this.aBool12004 = var2.method2239() && var4.aBool8001 && !this.aBool12010 && Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) != 0;
      int var13 = 2048;
      if(this.aBool12012) {
         var13 |= 65536;
      }

      if(var4.aBool8009) {
         var13 |= 524288;
      }

      Class4 var14 = this.method10845(var2, var13, this.aBool12004, -1858591536);
      if(var14 != null) {
         this.aClass168_12011 = (Class168)var14.anObject23;
         this.aClass526_Sub21_Sub5_12006 = (Class526_Sub21_Sub5)var14.anObject24;
         if(this.aBool12012 || var4.aBool8009) {
            this.aClass168_12011 = this.aClass168_12011.method1947((byte)0, var13, false);
            if(var4.aBool8009) {
               Class516 var15 = client.aClass505_11204.method6106((byte)34);
               this.aClass168_12011.method2020(var15.anInt7034 * 940075577, var15.anInt7033 * 110809671, 1450517549 * var15.anInt7032, 1524465723 * var15.anInt7035);
            }
         }
      }

      this.method9835(1, -224738684);
   }

   Class168 method10849(Class174 var1, int var2) {
      if(null != this.aClass168_12011 && var1.method2464(this.aClass168_12011.method2101(), var2) == 0) {
         return this.aClass168_12011;
      } else {
         Class4 var3 = this.method10845(var1, var2, false, -1858591536);
         return var3 != null?(Class168)var3.anObject23:null;
      }
   }

   boolean method9850() {
      return this.aBool12012;
   }

   public static void method10850(String var0, String var1, String var2, boolean var3, int var4) {
      if(var0.length() <= 320) {
         if(Class493.method5891((byte)48)) {
            client.aClass111_11059.method1369(1585829585);
            Class229.method3178(115661581);
            Class32.aString315 = var0;
            Class32.aString344 = var1;
            Class32.aString334 = var2;
            Class32.aBool309 = var3;
            Class593.method7031(1, (byte)30);
         }
      }
   }

   public static void method10851(int var0, int var1, int var2, Class610 var3, int var4) {
      for(Class526_Sub18 var5 = (Class526_Sub18)Class526_Sub18.aClass702_10505.method8206((byte)27); var5 != null; var5 = (Class526_Sub18)Class526_Sub18.aClass702_10505.method8181(661434550)) {
         if(483831257 * var5.anInt10484 == var0 && var5.anInt10485 * -408301813 == var1 << 9 && -319715047 * var5.anInt10480 == var2 << 9 && var5.aClass610_10501.anInt7959 * 445039693 == 445039693 * var3.anInt7959) {
            if(var5.aClass482_10506 != null) {
               var5.aClass482_10506.method5770(100, -938617916);
               Class570.aClass231_7657.method3204(var5.aClass482_10506, -273210987);
               var5.aClass482_10506 = null;
            }

            var5.method6332(-1949449864);
            return;
         }
      }

   }

   static final void method10852(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }
}
