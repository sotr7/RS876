package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class141;
import com.jagex.Class148;
import com.jagex.Class149;
import com.jagex.Class168;
import com.jagex.Class174;
import com.jagex.Class182;
import com.jagex.Class189;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class4;
import com.jagex.OutFrame;
import com.jagex.Class40_Sub8;
import com.jagex.Class445;
import com.jagex.Class446;
import com.jagex.Class526_Sub21_Sub5;
import com.jagex.Class526_Sub24;
import com.jagex.OutFrameBuffer;
import com.jagex.Class549;
import com.jagex.Class566;
import com.jagex.Class57;
import com.jagex.Class599;
import com.jagex.Class610;
import com.jagex.Class614;
import com.jagex.Class615;
import com.jagex.Class639_Sub1;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Class704_Sub2;
import com.jagex.Interface19;
import com.jagex.client;

public class Class529 {
   int anInt7171 = 767734947;
   boolean aBool7176 = false;
   Class168 aClass168_7167;
   boolean[] aBoolArray7177;
   Class526_Sub21_Sub5 aClass526_Sub21_Sub5_7175;
   int anInt7160 = 0;
   Class704 aClass704_7172;
   boolean aBool7169 = false;
   Class599 aClass599_7173;
   int anInt7164;
   Class704 aClass704_7179;
   boolean aBool7166 = false;
   Class40_Sub8 aClass40_Sub8_7170;
   int anInt7163;
   int anInt7162;
   int anInt7168;
   Class639_Sub1 aClass639_Sub1_7174;
   byte aByte7161;
   boolean aBool7165;
   Class614 aClass614_7178;

   boolean method6349() {
      return this.aBool7165;
   }

   int method6350(byte var1) {
      return -34456551 * this.anInt7160;
   }

   boolean method6351() {
      return this.aBool7165;
   }

   int method6352(byte var1) {
      return -this.method6350((byte)-54);
   }

   Class610 method6353(int var1) {
      return (Class610)this.aClass40_Sub8_7170.method89(this.anInt7163 * -544650689, -745535903);
   }

   final Class168 method6354(Class174 var1, int var2, boolean var3, boolean var4, int var5) {
      Class610 var6 = (Class610)this.aClass40_Sub8_7170.method89(this.anInt7163 * -544650689, -314073636);
      if(null != var6.anIntArray7989) {
         var6 = var6.method7179(Class242.aClass94_2456, (Interface19)(client.anInt11073 * 378016543 == 4?Class189.anInterface19_2154:Class242.aClass94_2456), (byte)-60);
      }

      if(null == var6) {
         this.method6367(var1, (short)-790);
         this.anInt7171 = 767734947;
         return null;
      } else {
         if(!this.aBool7169 && 445039693 * var6.anInt7959 != -1373347595 * this.anInt7171) {
            this.method6365(true, -1, 0, 0, -438547680);
            this.aBool7176 = false;
            this.aClass168_7167 = null;
         }

         this.method6359(this.aClass639_Sub1_7174, (byte)9);
         if(var4) {
            var4 &= this.aBool7165 & !this.aBool7176 & Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) != 0;
         }

         if(var3 && !var4) {
            this.anInt7171 = 248569593 * var6.anInt7959;
            return null;
         } else {
            Class446 var7 = this.aClass639_Sub1_7174.method7635().aClass446_4816;
            Class549 var8 = client.aClass505_11204.method6072(-1277423772);
            if(var4) {
               var8.method6601(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var7.aFloat4917, (int)var7.aFloat4919, this.aBoolArray7177, (byte)15);
               this.aBool7176 = false;
            }

            Class148 var9 = var8.aClass148Array7288[this.aByte7161];
            Class148 var10;
            if(this.aBool7166) {
               var10 = var8.aClass148Array7290[0];
            } else {
               var10 = this.aByte7161 < 3?var8.aClass148Array7288[1 + this.aByte7161]:null;
            }

            Class168 var11 = null;
            if(this.aClass704_7179.method8218((byte)-119)) {
               if(var4) {
                  var2 |= 262144;
               }

               var11 = var6.method7177(var1, var2, 11 != -65698791 * this.anInt7162?this.anInt7162 * -65698791:10, -65698791 * this.anInt7162 == 11?936783279 * this.anInt7168 + 4:936783279 * this.anInt7168, var9, var10, (int)var7.aFloat4917, var9.method1707((int)var7.aFloat4917, (int)var7.aFloat4919, -155721819), (int)var7.aFloat4919, this.aClass704_7179, this.aClass599_7173, -902062128);
               if(var11 != null) {
                  if(var4) {
                     if(null == this.aBoolArray7177) {
                        this.aBoolArray7177 = new boolean[4];
                     }

                     this.aClass526_Sub21_Sub5_7175 = var11.method1976(this.aClass526_Sub21_Sub5_7175);
                     var8.method6595(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var7.aFloat4917, (int)var7.aFloat4919, this.aBoolArray7177, -311777776);
                     this.aBool7176 = true;
                  }

                  this.anInt7160 = var11.method1981() * 1080254505;
                  var11.method2063();
               } else {
                  this.aBoolArray7177 = null;
                  this.aClass526_Sub21_Sub5_7175 = null;
                  this.anInt7160 = 0;
               }

               this.aClass168_7167 = null;
            } else if(this.aClass168_7167 != null && (this.aClass168_7167.method2101() & var2) == var2 && -1373347595 * this.anInt7171 == var6.anInt7959 * 445039693) {
               var11 = this.aClass168_7167;
            } else {
               if(this.aClass168_7167 != null) {
                  var2 |= this.aClass168_7167.method2101();
               }

               Class4 var12 = var6.method7176(var1, var2, -65698791 * this.anInt7162 != 11?this.anInt7162 * -65698791:10, -65698791 * this.anInt7162 == 11?this.anInt7168 * 936783279 + 4:this.anInt7168 * 936783279, var9, var10, (int)var7.aFloat4917, var9.method1707((int)var7.aFloat4917, (int)var7.aFloat4919, 975783033), (int)var7.aFloat4919, var4, this.aClass599_7173, -780912176);
               if(null != var12) {
                  this.aClass168_7167 = var11 = (Class168)var12.anObject23;
                  if(var4) {
                     this.aClass526_Sub21_Sub5_7175 = (Class526_Sub21_Sub5)var12.anObject24;
                     this.aBoolArray7177 = null;
                     var8.method6595(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var7.aFloat4917, (int)var7.aFloat4919, (boolean[])null, 749255625);
                     this.aBool7176 = true;
                  }

                  this.anInt7160 = var11.method1981() * 1080254505;
                  var11.method2063();
               } else {
                  this.aBoolArray7177 = null;
                  this.aClass526_Sub21_Sub5_7175 = null;
                  this.aClass168_7167 = null;
                  this.anInt7160 = 0;
               }
            }

            this.anInt7171 = 248569593 * var6.anInt7959;
            return var11;
         }
      }
   }

   public void method6355(int var1, int var2, int var3) {
      this.aClass704_7172 = null;
      if(var2 > 0) {
         this.aClass704_7172 = new Class704_Sub2(this.aClass639_Sub1_7174, false);
         this.aClass704_7172.method8225(var1, var2, 1, false, 155612939);
      } else {
         this.aBool7169 = true;
         this.method6365(false, var1, 1, 0, 140854208);
      }

   }

   boolean method6356(short var1) {
      return this.aBool7165;
   }

   void method6357(Class174 var1) {
      if(null != this.aClass526_Sub21_Sub5_7175) {
         Class446 var2 = this.aClass639_Sub1_7174.method7635().aClass446_4816;
         client.aClass505_11204.method6072(-1349459209).method6601(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var2.aFloat4917, (int)var2.aFloat4919, this.aBoolArray7177, (byte)-59);
         this.aBoolArray7177 = null;
         this.aClass526_Sub21_Sub5_7175 = null;
      }

   }

   void method6358(Class599 var1, int var2) {
      this.aClass599_7173 = var1;
      this.aClass168_7167 = null;
   }

   void method6359(Class639_Sub1 var1, byte var2) {
      if(null != this.aClass704_7172 && this.aClass704_7172.method8218((byte)-17)) {
         this.aClass704_7172.method8247(client.anInt11012 - 117520689 * this.anInt7164, (byte)48);
         if(this.aClass704_7172.method8249(1489468834)) {
            this.aClass704_7172.method8246(-1, (byte)-38);
         }

         if(!this.aClass704_7172.method8227((byte)9)) {
            this.aClass704_7179 = this.aClass704_7172;
            this.aBool7169 = true;
            this.anInt7164 = -831422511 * client.anInt11012;
            return;
         }
      }

      if(this.aClass704_7179.method8218((byte)-76)) {
         if(this.aClass704_7179.method8247(client.anInt11012 - 117520689 * this.anInt7164, (byte)-24)) {
            if(Class230.preferences.aClass711_Sub1_10622.method9805(-751289147) == 2) {
               this.aBool7176 = false;
            }

            if(this.aClass704_7179.method8249(-438114102)) {
               this.aClass704_7179.method8246(-1, (byte)-19);
               this.aBool7169 = false;
               this.method6365(false, -1, 0, 0, 541338839);
            }
         }
      } else {
         this.method6365(false, -1, 0, 0, 281683135);
      }

      this.anInt7164 = client.anInt11012 * -831422511;
   }

   public void method6360(int var1, int var2) {
      this.aClass704_7172 = null;
      if(var2 > 0) {
         this.aClass704_7172 = new Class704_Sub2(this.aClass639_Sub1_7174, false);
         this.aClass704_7172.method8225(var1, var2, 1, false, -1635225434);
      } else {
         this.aBool7169 = true;
         this.method6365(false, var1, 1, 0, -1992328307);
      }

   }

   public void method6361(int var1, int var2) {
      this.aClass704_7172 = null;
      if(var2 > 0) {
         this.aClass704_7172 = new Class704_Sub2(this.aClass639_Sub1_7174, false);
         this.aClass704_7172.method8225(var1, var2, 1, false, -1341179823);
      } else {
         this.aBool7169 = true;
         this.method6365(false, var1, 1, 0, -1867023374);
      }

   }

   void method6362(Class174 var1, byte var2) {
      this.method6354(var1, 262144, true, true, 2107897858);
   }

   Class529(Class174 var1, Class40_Sub8 var2, Class610 var3, int var4, int var5, int var6, Class639_Sub1 var7, boolean var8, int var9, int var10) {
      this.aClass40_Sub8_7170 = var2;
      this.anInt7163 = -1270409613 * var3.anInt7959;
      this.anInt7162 = 1459066921 * var4;
      this.anInt7168 = 225397071 * var5;
      this.aClass639_Sub1_7174 = var7;
      this.aBool7169 = -1 != var9;
      this.aByte7161 = (byte)var6;
      this.aBool7166 = var8;
      this.aBool7165 = var1.method2239() && var3.aBool8001 && !this.aBool7166;
      this.aClass704_7179 = new Class704_Sub2(var7, false);
      this.method6365(false, var9, 1, this.aBool7169?var10:0, -225205994);
   }

   boolean method6363() {
      return this.aBool7165;
   }

   void method6364(Class174 var1) {
      this.method6354(var1, 262144, true, true, 2107897858);
   }

   void method6365(boolean var1, int var2, int var3, int var4, int var5) {
      int var6 = var2;
      boolean var7 = false;
      if(-1 == var2) {
         Class610 var8 = (Class610)this.aClass40_Sub8_7170.method89(this.anInt7163 * -544650689, -643109305);
         Class610 var9 = var8;
         if(var8.anIntArray7989 != null) {
            var8 = var8.method7179(Class242.aClass94_2456, (Interface19)(4 == client.anInt11073 * 378016543?Class189.anInterface19_2154:Class242.aClass94_2456), (byte)-75);
         }

         if(null == var8) {
            return;
         }

         if(var8 == var9) {
            var9 = null;
         }

         if(var8.method7183((byte)0)) {
            if(!var8.aBool7963 || Class230.preferences.aClass711_Sub42_10607.method10199((byte)-31) == 1) {
               if(var1 && this.aClass704_7179.method8218((byte)-64) && var8.method7186(this.aClass704_7179.method8220(-1617399723), 1888728302)) {
                  return;
               }

               if(-1373347595 * this.anInt7171 != 445039693 * var8.anInt7959) {
                  var7 = var8.aBool7999;
               }

               var6 = var8.method7192((byte)0);
               if(var8.method7184(570338972)) {
                  var3 = 0;
               } else {
                  var3 = 1;
               }
            }
         } else if(var9 != null && var9.method7183((byte)0) && (!var9.aBool7963 || Class230.preferences.aClass711_Sub42_10607.method10199((byte)-52) == 1)) {
            if(var1 && this.aClass704_7179.method8218((byte)-85) && var9.method7186(this.aClass704_7179.method8220(-1729840886), 638169080)) {
               return;
            }

            if(this.anInt7171 * -1373347595 != 445039693 * var8.anInt7959) {
               var7 = var9.aBool7999;
            }

            var6 = var9.method7192((byte)0);
            if(var9.method7184(-1243746791)) {
               var3 = 0;
            } else {
               var3 = 1;
            }
         }
      }

      if(-1 == var6) {
         this.aClass704_7179.method8223(-1, false, (byte)1);
      } else {
         this.aClass704_7179.method8225(var6, var4, var3, var7, -274177014);
         this.anInt7164 = -831422511 * client.anInt11012;
         this.aBool7176 = false;
         this.aClass168_7167 = null;
      }
   }

   boolean method6366() {
      return this.aBool7165;
   }

   void method6367(Class174 var1, short var2) {
      if(null != this.aClass526_Sub21_Sub5_7175) {
         Class446 var3 = this.aClass639_Sub1_7174.method7635().aClass446_4816;
         client.aClass505_11204.method6072(-143790848).method6601(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var3.aFloat4917, (int)var3.aFloat4919, this.aBoolArray7177, (byte)-55);
         this.aBoolArray7177 = null;
         this.aClass526_Sub21_Sub5_7175 = null;
      }

   }

   void method6368(Class174 var1) {
      if(null != this.aClass526_Sub21_Sub5_7175) {
         Class446 var2 = this.aClass639_Sub1_7174.method7635().aClass446_4816;
         client.aClass505_11204.method6072(-2107930651).method6601(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var2.aFloat4917, (int)var2.aFloat4919, this.aBoolArray7177, (byte)-58);
         this.aBoolArray7177 = null;
         this.aClass526_Sub21_Sub5_7175 = null;
      }

   }

   void method6369(Class174 var1) {
      if(null != this.aClass526_Sub21_Sub5_7175) {
         Class446 var2 = this.aClass639_Sub1_7174.method7635().aClass446_4816;
         client.aClass505_11204.method6072(741472092).method6601(this.aClass526_Sub21_Sub5_7175, this.aByte7161, (int)var2.aFloat4917, (int)var2.aFloat4919, this.aBoolArray7177, (byte)-62);
         this.aBoolArray7177 = null;
         this.aClass526_Sub21_Sub5_7175 = null;
      }

   }

   void method6370(Class174 var1, Class168 var2, Class445 var3, int var4, int var5, int var6, int var7, boolean var8, int var9) {
      Class182[] var10 = var2.method1997();
      Class141[] var11 = var2.method2064();
      if((this.aClass614_7178 == null || this.aClass614_7178.aBool8074) && (null != var10 || var11 != null)) {
         Class610 var12 = (Class610)this.aClass40_Sub8_7170.method89(this.anInt7163 * -544650689, -839934476);
         if(null != var12.anIntArray7989) {
            var12 = var12.method7179(Class242.aClass94_2456, (Interface19)(client.anInt11073 * 378016543 == 4?Class189.anInterface19_2154:Class242.aClass94_2456), (byte)-79);
         }

         if(null != var12) {
            this.aClass614_7178 = Class614.method7263(client.anInt11012, true);
         }
      }

      if(this.aClass614_7178 != null) {
         var2.method1996(var3);
         if(var8) {
            this.aClass614_7178.method7250(var1, (long)client.anInt11012, var10, var11, false);
         } else {
            this.aClass614_7178.method7268((long)client.anInt11012);
         }

         this.aClass614_7178.method7254(this.aByte7161, var4, var5, var6, var7);
      }

   }

   static final void method6371(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.anInt2470 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] * -471105013;
   }

   static final void method6372(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2645 = Class615.method7280(var4, var2, -1952054612);
      var0.aBool2560 = true;
   }

   static void method6373(Class111 var0, int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4183, var0.aClass14_1342, 1681662145);
      var2.out.writeByte(Class57.method1014(-1898774810), -1542014477);
      var2.out.writeShort(1895615023 * Class566.anInt7611, -805078716);
      var2.out.writeShort(Class526_Sub24.anInt10549 * 974996221, -805078716);
      var2.out.writeByte(Class230.preferences.aClass711_Sub33_10645.method10135((byte)125), 1553557213);
      var0.write(var2, (byte)-87);
   }
}
