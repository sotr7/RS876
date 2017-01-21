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
import com.jagex.Class594;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class625;
import com.jagex.Class639_Sub1;
import com.jagex.Class639_Sub1_Sub1;
import com.jagex.Class639_Sub1_Sub2_Sub3;
import com.jagex.Interface59;
import com.jagex.client;

public class Class639_Sub1_Sub1_Sub1 extends Class639_Sub1_Sub1 implements Interface59 {
   boolean aBool12002;
   Class526_Sub21_Sub5 aClass526_Sub21_Sub5_11995;
   Class550 aClass550_11996;
   Class40_Sub8 aClass40_Sub8_11993;
   int anInt11998;
   boolean aBool11997;
   byte aByte12000;
   byte aByte11991;
   boolean aBool12001;
   boolean aBool12003;
   Class168 aClass168_11994;
   static int[] anIntArray11999 = new int[]{1, 2, 4, 8};
   static int[] anIntArray11992 = new int[]{16, 32, 64, 128};

   boolean method9864(byte var1) {
      return this.aBool12002;
   }

   boolean method9821(int var1) {
      return this.aClass168_11994 != null?!this.aClass168_11994.method1953():true;
   }

   void method9842(int var1) {
      this.aBool12002 = false;
      if(this.aClass168_11994 != null) {
         this.aClass168_11994.method2110(this.aClass168_11994.method2101() & -65537);
      }

   }

   public int method9832(byte var1) {
      return this.aClass168_11994 != null?this.aClass168_11994.method1981():0;
   }

   Class168 method10842(Class174 var1, int var2, byte var3) {
      if(null != this.aClass168_11994 && var1.method2464(this.aClass168_11994.method2101(), var2) == 0) {
         return this.aClass168_11994;
      } else {
         Class4 var4 = this.method10843(var1, var2, false, (byte)-4);
         return var4 != null?(Class168)var4.anObject23:null;
      }
   }

   public void method382(Class174 var1, int var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(this.aClass526_Sub21_Sub5_11995 == null && this.aBool12003) {
         Class4 var4 = this.method10843(var1, 262144, true, (byte)-58);
         var3 = (Class526_Sub21_Sub5)(null != var4?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(var3 != null) {
         this.aClass549_10826.method6595(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, -926178701);
      }

   }

   public Class550 method9827(Class174 var1, int var2) {
      Class446 var3 = this.method7635().aClass446_4816;
      if(this.aClass550_11996 == null) {
         this.aClass550_11996 = Class625.method7449((int)var3.aFloat4917, (int)var3.aFloat4915, (int)var3.aFloat4919, this.method10842(var1, 0, (byte)9), -300534898);
      }

      return this.aClass550_11996;
   }

   public int method394() {
      return this.aByte11991;
   }

   void method9834(Class174 var1, int var2) {
   }

   boolean method9818(Class174 var1, int var2, int var3, byte var4) {
      Class437 var5 = ((Class610)this.aClass40_Sub8_11993.method89(-1637776659 * this.anInt11998, -2117193458)).aClass437_8007;
      if(var5 != null) {
         return var1.method2301(var2, var3, this.method7623(), var5, 1643146617);
      } else {
         Class168 var6 = this.method10842(var1, 131072, (byte)79);
         if(null != var6) {
            Class445 var7 = this.method7623();
            return var6.method1975(var2, var3, var7, false, 0);
         } else {
            return false;
         }
      }
   }

   Class555 method9825(Class174 var1, int var2) {
      if(this.aClass168_11994 == null) {
         return null;
      } else {
         Class445 var3 = this.method7623();
         Class555 var4 = Class463.method5475(this.aBool12001, (short)29530);
         Class437 var5 = ((Class610)this.aClass40_Sub8_11993.method89(-1637776659 * this.anInt11998, -991813575)).aClass437_8007;
         if(var5 != null) {
            this.aClass168_11994.method1974(var3, (Class164)null, 0);
            var1.method2303(var3, this.aClass164Array10829[0], var5);
         } else {
            this.aClass168_11994.method1974(var3, this.aClass164Array10829[0], 0);
         }

         return var4;
      }
   }

   Class4 method10843(Class174 var1, int var2, boolean var3, byte var4) {
      Class610 var5 = (Class610)this.aClass40_Sub8_11993.method89(this.anInt11998 * -1637776659, -1561490962);
      Class148 var6;
      Class148 var7;
      if(this.aBool11997) {
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
      return var5.method7176(var1, var2, this.aByte12000, this.aByte11991, var6, var7, (int)var8.aFloat4917, (int)var8.aFloat4915, (int)var8.aFloat4919, var3, (Class599)null, -157403140);
   }

   void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      if(var2 instanceof Class639_Sub1_Sub1_Sub1) {
         Class639_Sub1_Sub1_Sub1 var7 = (Class639_Sub1_Sub1_Sub1)var2;
         if(null != this.aClass168_11994 && null != var7.aClass168_11994) {
            this.aClass168_11994.method1999(var7.aClass168_11994, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class639_Sub1_Sub2_Sub3) {
         Class639_Sub1_Sub2_Sub3 var8 = (Class639_Sub1_Sub2_Sub3)var2;
         if(this.aClass168_11994 != null && var8.aClass168_11980 != null) {
            this.aClass168_11994.method1999(var8.aClass168_11980, var3, var4, var5, var6);
         }
      }

   }

   public int method56(int var1) {
      return this.anInt11998 * -1637776659;
   }

   public Class639_Sub1_Sub1_Sub1(Class549 var1, Class174 var2, Class40_Sub8 var3, Class610 var4, int var5, int var6, int var7, int var8, int var9, boolean var10, int var11, int var12, boolean var13) {
      super(var1, var7, var8, var9, var5, var6, Class639_Sub1_Sub2_Sub3.method10839(var11, var12, -1204467882));
      this.aClass40_Sub8_11993 = var3;
      this.anInt11998 = 162347745 * var4.anInt7959;
      this.aBool11997 = var10;
      this.aByte12000 = (byte)var11;
      this.aByte11991 = (byte)var12;
      this.aBool12001 = 0 != 909601847 * var4.anInt7954 && !var10;
      this.aBool12002 = var13;
      this.aBool12003 = var2.method2239() && var4.aBool8001 && !this.aBool11997 && Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) != 0;
      int var14 = 2048;
      if(this.aBool12002) {
         var14 |= 65536;
      }

      if(var4.aBool8009) {
         var14 |= 524288;
      }

      Class4 var15 = this.method10843(var2, var14, this.aBool12003, (byte)-123);
      if(null != var15) {
         this.aClass168_11994 = (Class168)var15.anObject23;
         this.aClass526_Sub21_Sub5_11995 = (Class526_Sub21_Sub5)var15.anObject24;
         if(this.aBool12002 || var4.aBool8009) {
            this.aClass168_11994 = this.aClass168_11994.method1947((byte)0, var14, false);
            if(var4.aBool8009) {
               Class516 var16 = client.aClass505_11204.method6106((byte)37);
               this.aClass168_11994.method2020(var16.anInt7034 * 940075577, var16.anInt7033 * 110809671, 1450517549 * var16.anInt7032, 1524465723 * var16.anInt7035);
            }
         }
      }

      this.method9835(1, -251432392);
   }

   public Class550 method9840(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_11996 == null) {
         this.aClass550_11996 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10842(var1, 0, (byte)3), -1436314750);
      }

      return this.aClass550_11996;
   }

   public boolean method384(byte var1) {
      return true;
   }

   Class555 method9844(Class174 var1) {
      if(this.aClass168_11994 == null) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool12001, (short)28863);
         Class437 var4 = ((Class610)this.aClass40_Sub8_11993.method89(-1637776659 * this.anInt11998, -432263410)).aClass437_8007;
         if(var4 != null) {
            this.aClass168_11994.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_11994.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   public void method393(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11995 && this.aBool12003) {
         Class4 var3 = this.method10843(var1, 262144, true, (byte)-92);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)62);
      }

   }

   void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7) {
      if(var2 instanceof Class639_Sub1_Sub1_Sub1) {
         Class639_Sub1_Sub1_Sub1 var8 = (Class639_Sub1_Sub1_Sub1)var2;
         if(null != this.aClass168_11994 && null != var8.aClass168_11994) {
            this.aClass168_11994.method1999(var8.aClass168_11994, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class639_Sub1_Sub2_Sub3) {
         Class639_Sub1_Sub2_Sub3 var9 = (Class639_Sub1_Sub2_Sub3)var2;
         if(this.aClass168_11994 != null && var9.aClass168_11980 != null) {
            this.aClass168_11994.method1999(var9.aClass168_11980, var3, var4, var5, var6);
         }
      }

   }

   boolean method9841() {
      return null != this.aClass168_11994?this.aClass168_11994.method2014():false;
   }

   public int method9() {
      return this.anInt11998 * -1637776659;
   }

   public Class550 method9829(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_11996 == null) {
         this.aClass550_11996 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10842(var1, 0, (byte)50), -1813947176);
      }

      return this.aClass550_11996;
   }

   public int method130() {
      return this.anInt11998 * -1637776659;
   }

   public void method381(Class174 var1, byte var2) {
      Class526_Sub21_Sub5 var3 = null;
      if(null == this.aClass526_Sub21_Sub5_11995 && this.aBool12003) {
         Class4 var4 = this.method10843(var1, 262144, true, (byte)-114);
         var3 = (Class526_Sub21_Sub5)(var4 != null?var4.anObject24:null);
      } else {
         var3 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var5 = this.method7635().aClass446_4816;
      if(var3 != null) {
         this.aClass549_10826.method6601(var3, this.aByte10828, (int)var5.aFloat4917, (int)var5.aFloat4919, (boolean[])null, (byte)-44);
      }

   }

   public int method379(byte var1) {
      return this.aByte11991;
   }

   public boolean method385() {
      return this.aBool12003;
   }

   public boolean method265() {
      return this.aBool12003;
   }

   public boolean method387() {
      return true;
   }

   public boolean method378() {
      return true;
   }

   public void method389(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(this.aClass526_Sub21_Sub5_11995 == null && this.aBool12003) {
         Class4 var3 = this.method10843(var1, 262144, true, (byte)-96);
         var2 = (Class526_Sub21_Sub5)(null != var3?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, -248064155);
      }

   }

   public void method390(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(this.aClass526_Sub21_Sub5_11995 == null && this.aBool12003) {
         Class4 var3 = this.method10843(var1, 262144, true, (byte)-123);
         var2 = (Class526_Sub21_Sub5)(null != var3?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6595(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, -1339833841);
      }

   }

   boolean method9822(int var1) {
      return null != this.aClass168_11994?this.aClass168_11994.method2014():false;
   }

   public void method392(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11995 && this.aBool12003) {
         Class4 var3 = this.method10843(var1, 262144, true, (byte)-117);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)67);
      }

   }

   public void method386() {
      if(this.aClass168_11994 != null) {
         this.aClass168_11994.method1950();
      }

   }

   public void method383(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11995 && this.aBool12003) {
         Class4 var3 = this.method10843(var1, 262144, true, (byte)-116);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)75);
      }

   }

   boolean method9836() {
      return this.aClass168_11994 != null?!this.aClass168_11994.method1953():true;
   }

   public boolean method380(byte var1) {
      return this.aBool12003;
   }

   public int method9838() {
      return this.aClass168_11994 != null?this.aClass168_11994.method1981():0;
   }

   public int method9833() {
      return this.aClass168_11994 != null?this.aClass168_11994.method1981():0;
   }

   Class555 method9858(Class174 var1) {
      if(this.aClass168_11994 == null) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool12001, (short)7022);
         Class437 var4 = ((Class610)this.aClass40_Sub8_11993.method89(-1637776659 * this.anInt11998, -1792081628)).aClass437_8007;
         if(var4 != null) {
            this.aClass168_11994.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_11994.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   public int method139() {
      return this.aByte12000;
   }

   public Class550 method9856(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_11996 == null) {
         this.aClass550_11996 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10842(var1, 0, (byte)115), 98226209);
      }

      return this.aClass550_11996;
   }

   public Class550 method9843(Class174 var1) {
      Class446 var2 = this.method7635().aClass446_4816;
      if(this.aClass550_11996 == null) {
         this.aClass550_11996 = Class625.method7449((int)var2.aFloat4917, (int)var2.aFloat4915, (int)var2.aFloat4919, this.method10842(var1, 0, (byte)6), -1611266943);
      }

      return this.aClass550_11996;
   }

   public int method87(int var1) {
      return this.aByte12000;
   }

   Class555 method9828(Class174 var1) {
      if(this.aClass168_11994 == null) {
         return null;
      } else {
         Class445 var2 = this.method7623();
         Class555 var3 = Class463.method5475(this.aBool12001, (short)12818);
         Class437 var4 = ((Class610)this.aClass40_Sub8_11993.method89(-1637776659 * this.anInt11998, -1856089072)).aClass437_8007;
         if(var4 != null) {
            this.aClass168_11994.method1974(var2, (Class164)null, 0);
            var1.method2303(var2, this.aClass164Array10829[0], var4);
         } else {
            this.aClass168_11994.method1974(var2, this.aClass164Array10829[0], 0);
         }

         return var3;
      }
   }

   public void method391(Class174 var1) {
      Class526_Sub21_Sub5 var2 = null;
      if(null == this.aClass526_Sub21_Sub5_11995 && this.aBool12003) {
         Class4 var3 = this.method10843(var1, 262144, true, (byte)-34);
         var2 = (Class526_Sub21_Sub5)(var3 != null?var3.anObject24:null);
      } else {
         var2 = this.aClass526_Sub21_Sub5_11995;
         this.aClass526_Sub21_Sub5_11995 = null;
      }

      Class446 var4 = this.method7635().aClass446_4816;
      if(var2 != null) {
         this.aClass549_10826.method6601(var2, this.aByte10828, (int)var4.aFloat4917, (int)var4.aFloat4919, (boolean[])null, (byte)-32);
      }

   }

   void method9848(Class174 var1) {
   }

   boolean method9849(Class174 var1, int var2, int var3) {
      Class437 var4 = ((Class610)this.aClass40_Sub8_11993.method89(-1637776659 * this.anInt11998, -1091419692)).aClass437_8007;
      if(var4 != null) {
         return var1.method2301(var2, var3, this.method7623(), var4, -9255641);
      } else {
         Class168 var5 = this.method10842(var1, 131072, (byte)91);
         if(null != var5) {
            Class445 var6 = this.method7623();
            return var5.method1975(var2, var3, var6, false, 0);
         } else {
            return false;
         }
      }
   }

   boolean method9850() {
      return this.aBool12002;
   }

   boolean method9851() {
      return this.aBool12002;
   }

   public void method388(int var1) {
      if(this.aClass168_11994 != null) {
         this.aClass168_11994.method1950();
      }

   }

   void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6) {
      if(var2 instanceof Class639_Sub1_Sub1_Sub1) {
         Class639_Sub1_Sub1_Sub1 var7 = (Class639_Sub1_Sub1_Sub1)var2;
         if(null != this.aClass168_11994 && null != var7.aClass168_11994) {
            this.aClass168_11994.method1999(var7.aClass168_11994, var3, var4, var5, var6);
         }
      } else if(var2 instanceof Class639_Sub1_Sub2_Sub3) {
         Class639_Sub1_Sub2_Sub3 var8 = (Class639_Sub1_Sub2_Sub3)var2;
         if(this.aClass168_11994 != null && var8.aClass168_11980 != null) {
            this.aClass168_11994.method1999(var8.aClass168_11980, var3, var4, var5, var6);
         }
      }

   }

   void method9847() {
      this.aBool12002 = false;
      if(this.aClass168_11994 != null) {
         this.aClass168_11994.method2110(this.aClass168_11994.method2101() & -65537);
      }

   }

   static int method10844(int var0, int var1) {
      return -1226971375 * Class594.aClass594_7836.anInt7833 != var0 && var0 != Class594.aClass594_7824.anInt7833 * -1226971375?anIntArray11999[var1 & 3]:anIntArray11992[var1 & 3];
   }

   public int method137() {
      return this.anInt11998 * -1637776659;
   }
}
