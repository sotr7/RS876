package com.jagex;

import com.jagex.Class148;
import com.jagex.Class164;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class230;
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
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class639_Sub1_Sub5;
import com.jagex.Interface59;
import com.jagex.client;

public class Class639_Sub1_Sub5_Sub2 extends Class639_Sub1_Sub5 implements Interface59 {
   Class40_Sub8 aClass40_Sub8_12022;
   int anInt12018;
   boolean aBool12021;
   byte aByte12017;
   byte aByte12020;
   boolean aBool12023;
   boolean aBool12019;
   Class168 aClass168_12015;
   Class526_Sub21_Sub5 aClass526_Sub21_Sub5_12016;
   Class550 aClass550_12014;

   public boolean method385() {
      return this.aBool12019;
   }

   boolean method9821(int var1) {
      return this.aClass168_12015 != null?!this.aClass168_12015.method1953():true;
   }

   boolean method9822(int var1) {
      return this.aClass168_12015 != null?this.aClass168_12015.method2014():false;
   }

   public int method9832(byte var1) {
      return null != this.aClass168_12015?this.aClass168_12015.method1981():0;
   }

   public Class639_Sub1_Sub5_Sub2(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, int var13, int var14) {
      super(var1, var7, var8, var9, var5, var6, var11, var12);
      this.aClass40_Sub8_12022 = var3;
      this.anInt12018 = var4.anInt7959 * 966011511;
      this.aBool12021 = var10;
      this.aByte12017 = (byte)var14;
      this.aByte12020 = (byte)var13;
      this.aBool12023 = 0 != 909601847 * var4.anInt7954 && !var10;
      this.aBool12019 = var2.method2239() && var4.aBool8001 && !this.aBool12021 && Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) != 0;
      int var15 = 2048;
      if(var4.aBool8009) {
         var15 |= 524288;
      }

      Class4 var16 = this.method10853(var2, var15, this.aBool12019, (byte)78);
      if(null != var16) {
         this.aClass168_12015 = (Class168)var16.anObject23;
         this.aClass526_Sub21_Sub5_12016 = (Class526_Sub21_Sub5)var16.anObject24;
         if(var4.aBool8009) {
            this.aClass168_12015 = this.aClass168_12015.method1947((byte)0, var15, false);
            if(var4.aBool8009) {
               Class516 var17 = client.aClass505_11204.method6106((byte)-75);
               this.aClass168_12015.method2020(var17.anInt7034 * 940075577, 110809671 * var17.anInt7033, var17.anInt7032 * 1450517549, 1524465723 * var17.anInt7035);
            }
         }
      }

      this.method9835(1, -1049488051);
   }

   Class4 method10853(Class174 var1, int var2, boolean var3, byte var4) {
      Class610 var5 = (Class610)this.aClass40_Sub8_12022.method89(1929426011 * this.anInt12018, -152169506);
      Class148 var6;
      Class148 var7;
      if(this.aBool12021) {
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
      return var5.method7176(var1, var2, this.aByte12020, this.aByte12017, var6, var7, (int)var8.aFloat4917, (int)var8.aFloat4915, (int)var8.aFloat4919, var3, (Class599)null, 743983522);
   }

   public int method130() {
      return this.anInt12018 * 1929426011;
   }

   Class555 method9825(Class174 var1, int var2) {
      if(this.aClass168_12015 == null) {
         return null;
      } else {
         Class445 var3 = var1.method2319();
         var3.method5242(this.method7623());
         var3.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class555 var4 = Class463.method5475(this.aBool12023, (short)990);
         Class437 var5 = ((Class610)this.aClass40_Sub8_12022.method89(1929426011 * this.anInt12018, 170916715)).aClass437_8007;
         if(null != var5) {
            this.aClass168_12015.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5);
         } else {
            this.aClass168_12015.method1974(var3, this.aClass164Array10829[0], 0);
         }

         return var4;
      }
   }

   void method9834(Class174 var1, int var2) {
   }

   public void method382(Class174 var1, int var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(this.aClass526_Sub21_Sub5_12016 == null && this.aBool12019) {
         Class4 var4 = this.method10853(var1, 262144, true, (byte)126);
         var3 = (Class526_Sub21_Sub5)(null != var4?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(var3 != null) {
         this.aClass549_10826.method6595(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, -2144578254);
      }

   }

   boolean method9836() {
      return this.aClass168_12015 != null?!this.aClass168_12015.method1953():true;
   }

   public int method87(int var1) {
      return this.aByte12020;
   }

   public int method379(byte var1) {
      return this.aByte12017;
   }

   public void method388(int var1) {
      if(null != this.aClass168_12015) {
         this.aClass168_12015.method1950();
      }

   }

   Class4 method10854(Class174 var1, int var2, boolean var3) {
      Class610 var4 = (Class610)this.aClass40_Sub8_12022.method89(1929426011 * this.anInt12018, -718870666);
      Class148 var5;
      Class148 var6;
      if(this.aBool12021) {
         var5 = this.aClass549_10826.aClass148Array7292[this.aByte10828];
         var6 = this.aClass549_10826.aClass148Array7290[0];
      } else {
         var5 = this.aClass549_10826.aClass148Array7290[this.aByte10828];
         if(this.aByte10828 < 3) {
            var6 = this.aClass549_10826.aClass148Array7290[this.aByte10828 + 1];
         } else {
            var6 = null;
         }
      }

      Class446 var7 = this.method7635().aClass446_4816;
      return var4.method7176(var1, var2, this.aByte12020, this.aByte12017, var5, var6, (int)var7.aFloat4917, (int)var7.aFloat4915, (int)var7.aFloat4919, var3, (Class599)null, -677815860);
   }

   public boolean method380(byte var1) {
      return this.aBool12019;
   }

   public boolean method384(byte var1) {
      return true;
   }

   public void method381(Class174 var1, byte var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(null == this.aClass526_Sub21_Sub5_12016 && this.aBool12019) {
         Class4 var4 = this.method10853(var1, 262144, true, (byte)107);
         var3 = (Class526_Sub21_Sub5)(var4 != null?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(var3 != null) {
         this.aClass549_10826.method6601(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, (byte)57);
      }

   }

   public int method9() {
      return this.anInt12018 * 1929426011;
   }

   public void method386() {
      if(null != this.aClass168_12015) {
         this.aClass168_12015.method1950();
      }

   }

   public void method390(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(this.aClass526_Sub21_Sub5_12016 == null && this.aBool12019) {
         Class4 var3 = this.method10853(var1, 262144, true, (byte)125);
         var2 = (Class526_Sub21_Sub5)(null != var3?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, 1163917564);
      }

   }

   public int method139() {
      return this.aByte12020;
   }

   public int method394() {
      return this.aByte12017;
   }

   boolean method9841() {
      return this.aClass168_12015 != null?this.aClass168_12015.method2014():false;
   }

   public int method56(int var1) {
      return this.anInt12018 * 1929426011;
   }

   public boolean method265() {
      return this.aBool12019;
   }

   public boolean method387() {
      return true;
   }

   public boolean method378() {
      return true;
   }

   public void method389(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(this.aClass526_Sub21_Sub5_12016 == null && this.aBool12019) {
         Class4 var3 = this.method10853(var1, 262144, true, (byte)23);
         var2 = (Class526_Sub21_Sub5)(null != var3?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, -1696314488);
      }

   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class437 var5 = ((Class610)this.aClass40_Sub8_12022.method89(this.anInt12018 * 1929426011, 343503822)).aClass437_8007;
      if(null != var5) {
         return var1.method2301(var2, var3, this.method7623(), var5, 1553085831);
      } else {
         Class168 var6 = this.method10855(var1, 131072, (byte)1);
         if(var6 != null) {
            Class445 var7 = this.method7623();
            return var6.method1975(var2, var3, var7, false, 0);
         } else {
            return false;
         }
      }
   }

   Class168 method10855(Class174 var1, int var2, byte var3) {
      if(null != this.aClass168_12015 && var1.method2464(this.aClass168_12015.method2101(), var2) == 0) {
         return this.aClass168_12015;
      } else {
         Class4 var4 = this.method10853(var1, var2, false, (byte)49);
         return var4 != null?(Class168)var4.anObject23:null;
      }
   }

   public void method392(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12016 && this.aBool12019) {
         Class4 var3 = this.method10853(var1, 262144, true, (byte)60);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)-9);
      }

   }

   public void method393(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12016 && this.aBool12019) {
         Class4 var3 = this.method10853(var1, 262144, true, (byte)83);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)54);
      }

   }

   public void method383(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12016 && this.aBool12019) {
         Class4 var3 = this.method10853(var1, 262144, true, (byte)22);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)42);
      }

   }

   public int method137() {
      return this.anInt12018 * 1929426011;
   }

   public Class550 method9843(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12014 == null) {
         this.aClass550_12014 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10855(var1, 0, (byte)1), -1973809618);
      }

      return this.aClass550_12014;
   }

   public int method9838() {
      return null != this.aClass168_12015?this.aClass168_12015.method1981():0;
   }

   public int method9833() {
      return null != this.aClass168_12015?this.aClass168_12015.method1981():0;
   }

   public Class550 method9840(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12014 == null) {
         this.aClass550_12014 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10855(var1, 0, (byte)1), -1294914080);
      }

      return this.aClass550_12014;
   }

   public Class550 method9829(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12014 == null) {
         this.aClass550_12014 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10855(var1, 0, (byte)1), 13303856);
      }

      return this.aClass550_12014;
   }

   public Class550 method9856(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_12014 == null) {
         this.aClass550_12014 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10855(var1, 0, (byte)1), -1235833059);
      }

      return this.aClass550_12014;
   }

   public void method391(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_12016 && this.aBool12019) {
         Class4 var3 = this.method10853(var1, 262144, true, (byte)33);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_12016;
         this.aClass526_Sub21_Sub5_12016 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)-107);
      }

   }

   Class555 method9858(Class174 var1) {
      if(this.aClass168_12015 == null) {
         return null;
      } else {
         Class445 var2 = var1.method2319();
         var2.method5242(this.method7623());
         var2.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class555 var3 = Class463.method5475(this.aBool12023, (short)12832);
         Class437 var4 = ((Class610)this.aClass40_Sub8_12022.method89(1929426011 * this.anInt12018, 354267408)).aClass437_8007;
         if(null != var4) {
            this.aClass168_12015.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_12015.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   Class555 method9828(Class174 var1) {
      if(this.aClass168_12015 == null) {
         return null;
      } else {
         Class445 var2 = var1.method2319();
         var2.method5242(this.method7623());
         var2.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class555 var3 = Class463.method5475(this.aBool12023, (short)2216);
         Class437 var4 = ((Class610)this.aClass40_Sub8_12022.method89(1929426011 * this.anInt12018, 160841624)).aClass437_8007;
         if(null != var4) {
            this.aClass168_12015.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_12015.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   Class555 method9844(Class174 var1) {
      if(this.aClass168_12015 == null) {
         return null;
      } else {
         Class445 var2 = var1.method2319();
         var2.method5242(this.method7623());
         var2.method5251((float)this.aShort11854, 0.0F, (float)this.aShort11856);
         Class555 var3 = Class463.method5475(this.aBool12023, (short)27024);
         Class437 var4 = ((Class610)this.aClass40_Sub8_12022.method89(1929426011 * this.anInt12018, -1809460081)).aClass437_8007;
         if(null != var4) {
            this.aClass168_12015.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_12015.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   void method9848(Class174 var1) {
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class437 var4 = ((Class610)this.aClass40_Sub8_12022.method89(this.anInt12018 * 1929426011, 160924621)).aClass437_8007;
      if(null != var4) {
         return var1.method2301(var2, var3, this.method7623(), var4, 959429490);
      } else {
         Class168 var5 = this.method10855(var1, 131072, (byte)1);
         if(var5 != null) {
            Class445 var6 = this.method7623();
            return var5.method1975(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      }
   }

   Class168 method10856(Class174 var1, int var2) {
      if(null != this.aClass168_12015 && var1.method2464(this.aClass168_12015.method2101(), var2) == 0) {
         return this.aClass168_12015;
      } else {
         Class4 var3 = this.method10853(var1, var2, false, (byte)114);
         return var3 != null?(Class168)var3.anObject23:null;
      }
   }

   Class168 method10857(Class174 var1, int var2) {
      if(null != this.aClass168_12015 && var1.method2464(this.aClass168_12015.method2101(), var2) == 0) {
         return this.aClass168_12015;
      } else {
         Class4 var3 = this.method10853(var1, var2, false, (byte)52);
         return var3 != null?(Class168)var3.anObject23:null;
      }
   }

   public Class550 method9827(Class174 var1, int var2) {
      Class446 var3 = this.method7635().aClass446_4816;
      if(this.aClass550_12014 == null) {
         this.aClass550_12014 = Class625.method7449((int)var3.aFloat4917, (int)var3.aFloat4915, (int)var3.aFloat4919, this.method10855(var1, 0, (byte)1), -995094063);
      }

      return this.aClass550_12014;
   }
}
