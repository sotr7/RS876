package com.jagex;

import com.jagex.Class148;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class230;
import com.jagex.Class28;
import com.jagex.Class4;
import com.jagex.Class40_Sub8;
import com.jagex.Class437;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class463;
import com.jagex.Class516;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.Class594;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class619;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub2;
import com.jagex.Interface59;
import com.jagex.client;

public class Class639_Sub1_Sub2_Sub3 extends Class639_Sub1_Sub2 implements Interface59 {
   Class526_Sub21_Sub5 aClass526_Sub21_Sub5_11981;
   Class550 aClass550_11983;
   boolean aBool11988;
   Class40_Sub8 aClass40_Sub8_11984;
   int anInt11982;
   boolean aBool11986;
   byte aByte11990;
   byte aByte11985;
   boolean aBool11987;
   boolean aBool11979;
   boolean aBool11989;
   Class168 aClass168_11980;

   public void method382(Class174 var1, int var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var4 = this.method10837(var1, 262144, true, (byte)65);
         var3 = (Class526_Sub21_Sub5)(var4 != null?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(var3 != null) {
         this.aClass549_10826.method6595(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, 1162924905);
      }

   }

   public int method9() {
      return -740990691 * this.anInt11982;
   }

   boolean method9822(int var1) {
      return this.aClass168_11980 != null?this.aClass168_11980.method2014():false;
   }

   public boolean method385() {
      return this.aBool11979;
   }

   Class168 method10834(Class174 var1, int var2, int var3) {
      if(null != this.aClass168_11980 && var1.method2464(this.aClass168_11980.method2101(), var2) == 0) {
         return this.aClass168_11980;
      } else {
         Class4 var4 = this.method10837(var1, var2, false, (byte)-66);
         return var4 != null?(Class168)var4.anObject23:null;
      }
   }

   boolean method9821(int var1) {
      return null != this.aClass168_11980?!this.aClass168_11980.method1953():true;
   }

   public Class550 method9827(Class174 var1, int var2) {
      Class446 var3 = this.method7635().aClass446_4816;
      if(null == this.aClass550_11983) {
         this.aClass550_11983 = Class625.method7449((int)var3.aFloat4917, (int)var3.aFloat4915, (int)var3.aFloat4919, this.method10834(var1, 0, 619624689), -1195371748);
      }

      return this.aClass550_11983;
   }

   Class555 method9825(Class174 var1, int var2) {
      if(this.aClass168_11980 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class555 var4 = Class463.method5475(this.aBool11987, (short)8471);
         Class437 var5 = ((Class610)this.aClass40_Sub8_11984.method89(this.anInt11982 * -740990691, -1267594726)).aClass437_8007;
         if(null != var5) {
            this.aClass168_11980.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5);
         } else {
            this.aClass168_11980.method1974(var3, this.aClass164Array10829[0], 0);
         }

         return var4;
      }
   }

   void method9834(Class174 var1, int var2) {
   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class437 var5 = ((Class610)this.aClass40_Sub8_11984.method89(-740990691 * this.anInt11982, -652411579)).aClass437_8007;
      if(var5 != null) {
         return var1.method2301(var2, var3, this.method7623(), var5, 2042526248);
      } else {
         Class168 var6 = this.method10834(var1, 131072, -1563225623);
         if(var6 != null) {
            Class445 var7 = this.method7623();
            return var6.method1975(var2, var3, var7, false, 0);
         } else {
            return false;
         }
      }
   }

   public int method9832(byte var1) {
      return null != this.aClass168_11980?this.aClass168_11980.method1981():0;
   }

   void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var2 instanceof Class639_Sub1_Sub1_Sub1) {
         Class639_Sub1_Sub1_Sub1 var8 = (Class639_Sub1_Sub1_Sub1)var2;
         if(this.aClass168_11980 != null && null != var8.aClass168_11994) {
            this.aClass168_11980.method1999(var8.aClass168_11994, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class639_Sub1_Sub2_Sub3) {
         Class639_Sub1_Sub2_Sub3 var9 = (Class639_Sub1_Sub2_Sub3)var2;
         if(null != this.aClass168_11980 && null != var9.aClass168_11980) {
            this.aClass168_11980.method1999(var9.aClass168_11980, var3, var4, var5, var6);
         }
      }

   }

   boolean method9864(byte var1) {
      return this.aBool11988;
   }

   public int method56(int var1) {
      return -740990691 * this.anInt11982;
   }

   public int method87(int var1) {
      return this.aByte11990;
   }

   public int method379(byte var1) {
      return this.aByte11985;
   }

   public int method10835() {
      return this.aClass168_11980 != null?this.aClass168_11980.method2088() / 4:15;
   }

   public void method383(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var3 = this.method10837(var1, 262144, true, (byte)55);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)-95);
      }

   }

   public boolean method380(byte var1) {
      return this.aBool11979;
   }

   boolean method9836() {
      return null != this.aClass168_11980?!this.aClass168_11980.method1953():true;
   }

   public void method381(Class174 var1, byte var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var4 = this.method10837(var1, 262144, true, (byte)15);
         var3 = (Class526_Sub21_Sub5)(var4 != null?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(null != var3) {
         this.aClass549_10826.method6601(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, (byte)28);
      }

   }

   public int method10836(byte var1) {
      return this.aClass168_11980 != null?this.aClass168_11980.method2088() / 4:15;
   }

   public int method137() {
      return -740990691 * this.anInt11982;
   }

   public int method130() {
      return -740990691 * this.anInt11982;
   }

   public int method139() {
      return this.aByte11990;
   }

   public int method394() {
      return this.aByte11985;
   }

   public void method386() {
      if(null != this.aClass168_11980) {
         this.aClass168_11980.method1950();
      }

   }

   public void method390(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var3 = this.method10837(var1, 262144, true, (byte)47);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, -1832672430);
      }

   }

   public Class550 method9829(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(null == this.aClass550_11983) {
         this.aClass550_11983 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10834(var1, 0, 2111042929), -1972768550);
      }

      return this.aClass550_11983;
   }

   public boolean method387() {
      return this.aBool11989;
   }

   public boolean method378() {
      return this.aBool11989;
   }

   public void method389(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var3 = this.method10837(var1, 262144, true, (byte)-52);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, -358655730);
      }

   }

   public boolean method265() {
      return this.aBool11979;
   }

   public boolean method384(byte var1) {
      return this.aBool11989;
   }

   public void method392(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var3 = this.method10837(var1, 262144, true, (byte)-13);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)81);
      }

   }

   public void method388(int var1) {
      if(null != this.aClass168_11980) {
         this.aClass168_11980.method1950();
      }

   }

   void method9842(int var1) {
      this.aBool11988 = false;
      if(null != this.aClass168_11980) {
         this.aClass168_11980.method2110(this.aClass168_11980.method2101() & -65537);
      }

   }

   boolean method9841() {
      return this.aClass168_11980 != null?this.aClass168_11980.method2014():false;
   }

   Class4 method10837(Class174 var1, int var2, boolean var3, byte var4) {
      Class610 var5 = (Class610)this.aClass40_Sub8_11984.method89(-740990691 * this.anInt11982, -1270735122);
      Class148 var6;
      Class148 var7;
      if(this.aBool11986) {
         var6 = this.aClass549_10826.aClass148Array7292[this.aByte10828];
         var7 = this.aClass549_10826.aClass148Array7290[0];
      } else {
         var6 = this.aClass549_10826.aClass148Array7290[this.aByte10828];
         if(this.aByte10828 < 3) {
            var7 = this.aClass549_10826.aClass148Array7290[this.aByte10828 + 1];
         } else {
            var7 = null;
         }
      }

      Class446 var8 = this.method7635().aClass446_4816;
      return var5.method7176(var1, var2, -1226971375 * Class594.aClass594_7842.anInt7833 != this.aByte11990?this.aByte11990:Class594.aClass594_7841.anInt7833 * -1226971375, Class594.aClass594_7842.anInt7833 * -1226971375 == this.aByte11990?this.aByte11985 + 4:this.aByte11985, var6, var7, (int)var8.aFloat4917, (int)var8.aFloat4915, (int)var8.aFloat4919, var3, (Class599)null, -1687955280);
   }

   public int method9833() {
      return null != this.aClass168_11980?this.aClass168_11980.method1981():0;
   }

   public Class550 method9840(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(null == this.aClass550_11983) {
         this.aClass550_11983 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10834(var1, 0, -1874484041), -931103844);
      }

      return this.aClass550_11983;
   }

   public void method391(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var3 = this.method10837(var1, 262144, true, (byte)67);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)37);
      }

   }

   public Class550 method9856(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(null == this.aClass550_11983) {
         this.aClass550_11983 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10834(var1, 0, -365644598), -310059110);
      }

      return this.aClass550_11983;
   }

   public Class550 method9843(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(null == this.aClass550_11983) {
         this.aClass550_11983 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10834(var1, 0, 1947612634), -1143322622);
      }

      return this.aClass550_11983;
   }

   Class555 method9858(Class174 var1) {
      if(this.aClass168_11980 == null) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool11987, (short)17580);
         Class437 var4 = ((Class610)this.aClass40_Sub8_11984.method89(this.anInt11982 * -740990691, -1047047628)).aClass437_8007;
         if(null != var4) {
            this.aClass168_11980.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_11980.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   Class555 method9828(Class174 var1) {
      if(this.aClass168_11980 == null) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool11987, (short)6540);
         Class437 var4 = ((Class610)this.aClass40_Sub8_11984.method89(this.anInt11982 * -740990691, -1565272596)).aClass437_8007;
         if(null != var4) {
            this.aClass168_11980.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_11980.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   Class555 method9844(Class174 var1) {
      if(this.aClass168_11980 == null) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool11987, (short)6302);
         Class437 var4 = ((Class610)this.aClass40_Sub8_11984.method89(this.anInt11982 * -740990691, -654091066)).aClass437_8007;
         if(null != var4) {
            this.aClass168_11980.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_11980.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   void method9848(Class174 var1) {
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class437 var4 = ((Class610)this.aClass40_Sub8_11984.method89(-740990691 * this.anInt11982, -180458360)).aClass437_8007;
      if(var4 != null) {
         return var1.method2301(var2, var3, this.method7623(), var4, -348516628);
      } else {
         Class168 var5 = this.method10834(var1, 131072, 2059624182);
         if(var5 != null) {
            Class445 var6 = this.method7623();
            return var5.method1975(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      }
   }

   boolean method9850() {
      return this.aBool11988;
   }

   boolean method9851() {
      return this.aBool11988;
   }

   void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      if(var2 instanceof Class639_Sub1_Sub1_Sub1) {
         Class639_Sub1_Sub1_Sub1 var7 = (Class639_Sub1_Sub1_Sub1)var2;
         if(this.aClass168_11980 != null && null != var7.aClass168_11994) {
            this.aClass168_11980.method1999(var7.aClass168_11994, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class639_Sub1_Sub2_Sub3) {
         Class639_Sub1_Sub2_Sub3 var8 = (Class639_Sub1_Sub2_Sub3)var2;
         if(null != this.aClass168_11980 && null != var8.aClass168_11980) {
            this.aClass168_11980.method1999(var8.aClass168_11980, var3, var4, var5, var6);
         }
      }

   }

   void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      if(var2 instanceof Class639_Sub1_Sub1_Sub1) {
         Class639_Sub1_Sub1_Sub1 var7 = (Class639_Sub1_Sub1_Sub1)var2;
         if(this.aClass168_11980 != null && null != var7.aClass168_11994) {
            this.aClass168_11980.method1999(var7.aClass168_11994, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class639_Sub1_Sub2_Sub3) {
         Class639_Sub1_Sub2_Sub3 var8 = (Class639_Sub1_Sub2_Sub3)var2;
         if(null != this.aClass168_11980 && null != var8.aClass168_11980) {
            this.aClass168_11980.method1999(var8.aClass168_11980, var3, var4, var5, var6);
         }
      }

   }

   void method9847() {
      this.aBool11988 = false;
      if(null != this.aClass168_11980) {
         this.aClass168_11980.method2110(this.aClass168_11980.method2101() & -65537);
      }

   }

   public int method9838() {
      return null != this.aClass168_11980?this.aClass168_11980.method1981():0;
   }

   public int method10838() {
      return this.aClass168_11980 != null?this.aClass168_11980.method2088() / 4:15;
   }

   public void method393(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11981 && this.aBool11979) {
         Class4 var3 = this.method10837(var1, 262144, true, (byte)-29);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11981;
         this.aClass526_Sub21_Sub5_11981 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(null != var2) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)-48);
      }

   }

   public Class639_Sub1_Sub2_Sub3(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14, int var15, int var16, boolean var17, boolean var18) {
      super(var1, var5, var6, var7, var8, var9, var11, var12, var13, var14, 86646899 * var4.anInt7987 == 1, Class28.method730(var15, var16, 1728587729));
      this.aClass40_Sub8_11984 = var3;
      this.anInt11982 = -225953551 * var4.anInt7959;
      this.aByte10828 = (byte)var6;
      this.aBool11986 = var10;
      this.aByte11990 = (byte)var15;
      this.aByte11985 = (byte)var16;
      this.aBool11987 = 909601847 * var4.anInt7954 != 0 && !var10;
      this.aBool11988 = var17;
      this.aBool11979 = var2.method2239() && var4.aBool8001 && !this.aBool11986 && Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) != 0;
      this.aBool11989 = var18;
      int var19 = 2048;
      if(this.aBool11988) {
         var19 |= 65536;
      }

      if(var4.aBool8009) {
         var19 |= 524288;
      }

      Class4 var20 = this.method10837(var2, var19, this.aBool11979, (byte)-11);
      if(null != var20) {
         this.aClass168_11980 = (Class168)var20.anObject23;
         this.aClass526_Sub21_Sub5_11981 = (Class526_Sub21_Sub5)var20.anObject24;
         if(this.aBool11988 || var4.aBool8009) {
            this.aClass168_11980 = this.aClass168_11980.method1947((byte)0, var19, false);
            if(var4.aBool8009) {
               Class516 var21 = client.aClass505_11204.method6106((byte)52);
               this.aClass168_11980.method2020(var21.anInt7034 * 940075577, var21.anInt7033 * 110809671, var21.anInt7032 * 1450517549, var21.anInt7035 * 1524465723);
            }
         }
      }

      this.method9835(1, 541312760);
   }

   static int method10839(int var0, int var1, int var2) {
      return -1226971375 * Class594.aClass594_7836.anInt7833 != var0 && var0 != Class594.aClass594_7824.anInt7833 * -1226971375?Class639_Sub1_Sub1_Sub1.anIntArray11999[var1 & 3]:Class639_Sub1_Sub1_Sub1.anIntArray11992[var1 & 3];
   }

   public static int method10840(int var0) {
      return 1865223851 * Class619.anInt8121;
   }

   public static boolean method10841(int var0, byte var1) {
      return var0 >= -1226971375 * Class594.aClass594_7822.anInt7833 && var0 <= Class594.aClass594_7824.anInt7833 * -1226971375 || Class594.aClass594_7844.anInt7833 * -1226971375 == var0;
   }
}
