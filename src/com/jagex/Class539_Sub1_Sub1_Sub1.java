package com.jagex;

import com.jagex.Class130;
import com.jagex.Class148;
import com.jagex.Class174;
import com.jagex.Class304;
import com.jagex.Class385;
import com.jagex.Class391;
import com.jagex.Class526_Sub30;
import com.jagex.Class539_Sub1_Sub1;
import com.jagex.Class546;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class552;
import com.jagex.Class614;
import com.jagex.Class619;
import com.jagex.Class631;
import java.util.Iterator;

public class Class539_Sub1_Sub1_Sub1 extends Class539_Sub1_Sub1 {
   short aShort12100;
   Class631 aClass631_12098;
   short aShort12103;
   short aShort12097;
   short aShort12104;
   short aShort12101;
   short aShort12102;
   short aShort12096;
   int anInt12095;
   int anInt12099;

   void method10919() {
      int var1 = this.aClass631_12098.aClass614_8221.anInt8075;
      if(this.aClass631_12098.aClass614_8221.aClass539_Sub1_Sub1_Sub1Array8076[var1] != null) {
         this.aClass631_12098.aClass614_8221.aClass539_Sub1_Sub1_Sub1Array8076[var1].method10923();
      }

      this.aClass631_12098.aClass614_8221.aClass539_Sub1_Sub1_Sub1Array8076[var1] = this;
      this.aShort12100 = (short)this.aClass631_12098.aClass614_8221.anInt8075;
      this.aClass631_12098.aClass614_8221.anInt8075 = var1 + 1 & 8191;
      this.aClass631_12098.aClass686_8223.method8058(this, (byte)-44);
   }

   void method10920(Class631 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, boolean var16) {
      this.aClass631_12098 = var1;
      this.anInt11552 = var2 << 12;
      this.anInt11545 = var3 << 12;
      this.anInt11550 = var4 << 12;
      this.anInt11547 = var10;
      this.aShort12097 = this.aShort12103 = (short)var9;
      this.anInt11551 = var11;
      this.aShort11553 = (short)var12;
      this.aShort12104 = (short)var13;
      this.anInt11548 = var14;
      this.aBool11554 = var16;
      this.aShort12101 = (short)var5;
      this.aShort12102 = (short)var6;
      this.aShort12096 = (short)var7;
      this.anInt12095 = var8;
      this.method10919();
   }

   void method10921(long var1, int var3) {
      this.aShort12103 = (short)(this.aShort12103 - var3);
      if(this.aShort12103 <= 0) {
         this.method10923();
      } else {
         int var4 = this.anInt11552 >> 12;
         int var5 = this.anInt11545 >> 12;
         int var6 = this.anInt11550 >> 12;
         Class614 var7 = this.aClass631_12098.aClass614_8221;
         Class385 var8 = this.aClass631_12098.aClass385_8220;
         if(var8.anInt3980 * -1851178341 != 0) {
            int var9;
            if(this.aShort12097 - this.aShort12103 <= var8.anInt4026 * -1064403771) {
               var9 = (this.anInt11547 >> 8 & '\uff00') + (this.anInt12099 >> 16 & 255) + var8.anInt4028 * 235004215 * var3;
               int var10 = (this.anInt11547 & '\uff00') + (this.anInt12099 >> 8 & 255) + var8.anInt3990 * -1164968895 * var3;
               int var11 = (this.anInt11547 << 8 & '\uff00') + (this.anInt12099 & 255) + var8.anInt4030 * 1857408581 * var3;
               if(var9 < 0) {
                  var9 = 0;
               } else if(var9 > '\uffff') {
                  var9 = '\uffff';
               }

               if(var10 < 0) {
                  var10 = 0;
               } else if(var10 > '\uffff') {
                  var10 = '\uffff';
               }

               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > '\uffff') {
                  var11 = '\uffff';
               }

               this.anInt11547 &= -16777216;
               this.anInt11547 |= ((var9 & '\uff00') << 8) + (var10 & '\uff00') + ((var11 & '\uff00') >> 8);
               this.anInt12099 &= -16777216;
               this.anInt12099 |= ((var9 & 255) << 16) + ((var10 & 255) << 8) + (var11 & 255);
            }

            if(this.aShort12097 - this.aShort12103 <= var8.anInt4027 * 343691291) {
               var9 = (this.anInt11547 >> 16 & '\uff00') + (this.anInt12099 >> 24 & 255) + var8.anInt4031 * -241969559 * var3;
               if(var9 < 0) {
                  var9 = 0;
               } else if(var9 > '\uffff') {
                  var9 = '\uffff';
               }

               this.anInt11547 &= 16777215;
               this.anInt11547 |= (var9 & '\uff00') << 16;
               this.anInt12099 &= 16777215;
               this.anInt12099 |= (var9 & 255) << 24;
            }
         }

         if(var8.anInt3971 * -2137982385 != -1 && this.aShort12097 - this.aShort12103 <= var8.anInt3993 * -945140583) {
            this.anInt12095 += var8.anInt3970 * -14713815 * var3;
         }

         if(var8.anInt3975 * 1124265363 != -1 && this.aShort12097 - this.aShort12103 <= var8.anInt4034 * 1519265533) {
            this.anInt11551 += var8.anInt4008 * -611626751 * var3;
         }

         if(this.aShort12104 != 0) {
            this.aShort11553 = (short)(this.aShort11553 + this.aShort12104 * var3 & 16383);
         }

         double var12 = (double)this.aShort12101;
         double var14 = (double)this.aShort12102;
         double var16 = (double)this.aShort12096;
         boolean var18 = false;
         int var19;
         int var20;
         int var21;
         int var22;
         long var23;
         if(var8.anInt3969 * 173024777 == 1) {
            var19 = var4 - this.aClass631_12098.aClass636_8219.anInt8307 * 1564278383;
            var20 = var5 - this.aClass631_12098.aClass636_8219.anInt8300 * 1014761291;
            var21 = var6 - this.aClass631_12098.aClass636_8219.anInt8309 * -1026266877;
            var22 = (int)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21)) >> 2;
            var23 = (long)(var8.anInt4022 * 2010064011 * var22 * var3);
            this.anInt12095 = (int)((long)this.anInt12095 - ((long)this.anInt12095 * var23 >> 18));
         } else if(var8.anInt3969 * 173024777 == 2) {
            var19 = var4 - this.aClass631_12098.aClass636_8219.anInt8307 * 1564278383;
            var20 = var5 - this.aClass631_12098.aClass636_8219.anInt8300 * 1014761291;
            var21 = var6 - this.aClass631_12098.aClass636_8219.anInt8309 * -1026266877;
            var22 = var19 * var19 + var20 * var20 + var21 * var21;
            var23 = (long)(var8.anInt4022 * 2010064011 * var22 * var3);
            this.anInt12095 = (int)((long)this.anInt12095 - ((long)this.anInt12095 * var23 >> 28));
         }

         Class391 var64;
         Class526_Sub30 var63;
         if(var8.anIntArray3973 != null) {
            Iterator var62 = var7.aList8082.iterator();

            label225:
            while(true) {
               do {
                  if(!var62.hasNext()) {
                     break label225;
                  }

                  var63 = (Class526_Sub30)var62.next();
                  var64 = var63.aClass391_10569;
               } while(var64.anInt4078 * -1760706667 == 1);

               boolean var66 = false;

               for(int var25 = 0; var25 < var8.anIntArray3973.length; ++var25) {
                  if(var8.anIntArray3973[var25] == var64.anInt4077 * -216482513) {
                     var66 = true;
                     break;
                  }
               }

               if(var66) {
                  double var67 = (double)(var4 - var63.anInt10570 * 1900127761);
                  double var26 = (double)(var5 - var63.anInt10571 * 782318679);
                  double var28 = (double)(var6 - var63.anInt10572 * 1409278165);
                  double var30 = var67 * var67 + var26 * var26 + var28 * var28;
                  if(var30 <= (double)(var64.aLong4086 * 3268215641058619031L)) {
                     double var32 = Math.sqrt(var30);
                     if(var32 == 0.0D) {
                        var32 = 1.0D;
                     }

                     double var34 = (var67 * (double)var63.aFloat10573 + var26 * (double)(var64.anInt4081 * 2127383065) + var28 * (double)var63.aFloat10574) * 65535.0D / ((double)(var64.anInt4088 * 992356879) * var32);
                     if(var34 >= (double)(var64.anInt4090 * 201039565)) {
                        double var36 = 0.0D;
                        if(var64.anInt4082 * -1306396573 == 1) {
                           var36 = var32 / 16.0D * (double)(var64.anInt4076 * -449197459);
                        } else if(var64.anInt4082 * -1306396573 == 2) {
                           var36 = var32 / 16.0D * (var32 / 16.0D) * (double)(var64.anInt4076 * -449197459);
                        }

                        if(var64.anInt4084 * -2009146483 == 0) {
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += ((double)var63.aFloat10573 - var36) * (double)var3;
                              var14 += ((double)(var64.anInt4081 * 2127383065) - var36) * (double)var3;
                              var16 += ((double)var63.aFloat10574 - var36) * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + ((double)var63.aFloat10573 - var36) * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + ((double)(var64.anInt4081 * 2127383065) - var36) * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + ((double)var63.aFloat10574 - var36) * (double)var3);
                           }
                        } else {
                           double var38 = var67 / var32 * (double)(var64.anInt4088 * 992356879);
                           double var40 = var26 / var32 * (double)(var64.anInt4088 * 992356879);
                           double var42 = var28 / var32 * (double)(var64.anInt4088 * 992356879);
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += var38 * (double)var3;
                              var14 += var40 * (double)var3;
                              var16 += var42 * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + var38 * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + var40 * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + var42 * (double)var3);
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var8.anIntArray3989 != null) {
            label206:
            for(var19 = 0; var19 < var8.anIntArray3989.length; ++var19) {
               var63 = (Class526_Sub30)Class619.aClass20_8116.get((long)var8.anIntArray3989[var19]);

               while(true) {
                  while(true) {
                     if(var63 == null) {
                        continue label206;
                     }

                     var64 = var63.aClass391_10569;
                     double var44 = (double)(var4 - var63.anInt10570 * 1900127761);
                     double var46 = (double)(var5 - var63.anInt10571 * 782318679);
                     double var48 = (double)(var6 - var63.anInt10572 * 1409278165);
                     double var50 = var44 * var44 + var46 * var46 + var48 * var48;
                     if(var50 > (double)(var64.aLong4086 * 3268215641058619031L)) {
                        var63 = (Class526_Sub30)Class619.aClass20_8116.method635(-1734407897);
                     } else {
                        double var52 = Math.sqrt(var50);
                        if(var52 == 0.0D) {
                           var52 = 1.0D;
                        }

                        double var54;
                        if(var64.anInt4079 * -2040123637 > 0 && var64.anInt4079 * -2040123637 < 2047) {
                           var54 = (var44 * (double)var63.aFloat10573 + var46 * (double)(var64.anInt4081 * 2127383065) + var48 * (double)var63.aFloat10574) * 16384.0D / ((double)(var64.anInt4088 * 992356879) * var52);
                           if(var54 < (double)(var64.anInt4090 * 201039565)) {
                              var63 = (Class526_Sub30)Class619.aClass20_8116.method635(-1734407897);
                              continue;
                           }
                        }

                        var54 = 0.0D;
                        if(var64.anInt4082 * -1306396573 == 1) {
                           var54 = var52 / 16.0D * (double)(var64.anInt4076 * -449197459);
                        } else if(var64.anInt4082 * -1306396573 == 2) {
                           var54 = var52 / 16.0D * (var52 / 16.0D) * (double)(var64.anInt4076 * -449197459);
                        }

                        if(var64.anInt4084 * -2009146483 == 0) {
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += ((double)var63.aFloat10573 - var54) * (double)var3;
                              var14 += ((double)(var64.anInt4081 * 2127383065) - var54) * (double)var3;
                              var16 += ((double)var63.aFloat10574 - var54) * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + ((double)var63.aFloat10573 - var54) * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + ((double)(var64.anInt4081 * 2127383065) - var54) * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + ((double)var63.aFloat10574 - var54) * (double)var3);
                           }
                        } else {
                           double var56 = var44 / var52 * (double)(var64.anInt4088 * 992356879);
                           double var58 = var46 / var52 * (double)(var64.anInt4088 * 992356879);
                           double var60 = var48 / var52 * (double)(var64.anInt4088 * 992356879);
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += var56 * (double)var3;
                              var14 += var58 * (double)var3;
                              var16 += var60 * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + var56 * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + var58 * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + var60 * (double)var3);
                           }
                        }

                        var63 = (Class526_Sub30)Class619.aClass20_8116.method635(-1734407897);
                     }
                  }
               }
            }
         }

         if(var8.anIntArray3984 != null) {
            if(var8.anIntArray3991 == null) {
               var8.anIntArray3991 = new int[var8.anIntArray3984.length];

               for(var19 = 0; var19 < var8.anIntArray3984.length; ++var19) {
                  Class304.anInterface46_3280.method350(var8.anIntArray3984[var19], -1400754415);
                  var8.anIntArray3991[var19] = Class130.method1626(var8.anIntArray3984[var19], -1823942640);
               }
            }

            for(var19 = 0; var19 < var8.anIntArray3991.length; ++var19) {
               Class391 var65 = Class619.aClass391Array8118[var8.anIntArray3991[var19]];
               if(var65.anInt4075 * 1298462713 == 0) {
                  var12 += (double)(var65.anInt4080 * -2017397953 * var3);
                  var14 += (double)(var65.anInt4081 * 2127383065 * var3);
                  var16 += (double)(var65.anInt4083 * -1493442421 * var3);
                  var18 = true;
               } else {
                  this.anInt11552 += var65.anInt4080 * -2017397953 * var3;
                  this.anInt11545 += var65.anInt4081 * 2127383065 * var3;
                  this.anInt11550 += var65.anInt4083 * -1493442421 * var3;
               }
            }
         }

         if(var18) {
            while(true) {
               if(var12 <= 32767.0D && var14 <= 32767.0D && var16 <= 32767.0D && var12 >= -32767.0D && var14 >= -32767.0D && var16 >= -32767.0D) {
                  this.aShort12101 = (short)((int)var12);
                  this.aShort12102 = (short)((int)var14);
                  this.aShort12096 = (short)((int)var16);
                  break;
               }

               var12 /= 2.0D;
               var14 /= 2.0D;
               var16 /= 2.0D;
               this.anInt12095 <<= 1;
            }
         }

         this.anInt11552 = (int)((long)this.anInt11552 + ((long)this.aShort12101 * (long)(this.anInt12095 << 2) >> 23) * (long)var3);
         this.anInt11545 = (int)((long)this.anInt11545 + ((long)this.aShort12102 * (long)(this.anInt12095 << 2) >> 23) * (long)var3);
         this.anInt11550 = (int)((long)this.anInt11550 + ((long)this.aShort12096 * (long)(this.anInt12095 << 2) >> 23) * (long)var3);
      }
   }

   void method10922(Class549 var1, Class174 var2, long var3) {
      int var5 = this.anInt11552 >> 12 + var1.anInt7316 * 1705818315;
      int var6 = this.anInt11550 >> 12 + var1.anInt7316 * 1705818315;
      int var7 = this.anInt11545 >> 12;
      if(var7 <= 262144 && var7 >= -262144 && var5 >= 0 && var5 < var1.anInt7285 * -447634797 && var6 >= 0 && var6 < var1.anInt7286 * 1913648871) {
         Class614 var8 = this.aClass631_12098.aClass614_8221;
         Class385 var9 = this.aClass631_12098.aClass385_8220;
         Class148[] var10 = var1.aClass148Array7288;
         int var11 = var8.anInt8077;
         Class552 var12 = var1.aClass552ArrayArrayArray7287[var8.anInt8077][var5][var6];
         if(var12 != null) {
            var11 = var12.aByte7354;
         }

         int var13 = var10[var11].method1714(var5, var6, 2141490976);
         int var14;
         if(var11 < var1.anInt7284 * 1756626709 - 1) {
            var14 = var10[var11 + 1].method1714(var5, var6, 135388587);
         } else {
            var14 = var13 - (8 << var1.anInt7316 * 1705818315);
         }

         if(var9.aBool4021) {
            if(var9.anInt4035 * -2105537701 == -1 && var7 > var13) {
               this.method10923();
               return;
            }

            if(var9.anInt4035 * -2105537701 >= 0 && var7 > var10[var9.anInt4035 * -2105537701].method1714(var5, var6, 2060513685)) {
               this.method10923();
               return;
            }

            if(var9.anInt3994 * 1876374915 == -1 && var7 < var14) {
               this.method10923();
               return;
            }

            if(var9.anInt3994 * 1876374915 >= 0 && var7 < var10[var9.anInt3994 * 1876374915 + 1].method1714(var5, var6, 1734742977)) {
               this.method10923();
               return;
            }
         }

         int var15;
         for(var15 = var1.anInt7284 * 1756626709 - 1; var15 > 0 && var7 > var10[var15].method1714(var5, var6, -764430983); --var15) {
            ;
         }

         if(var9.aBool4011 && var15 == 0 && var7 > var10[0].method1714(var5, var6, -1998520277)) {
            this.method10923();
         } else if(var15 == var1.anInt7284 * 1756626709 - 1 && var10[var15].method1714(var5, var6, -1022105540) - var7 > 8 << var1.anInt7316 * 1705818315) {
            this.method10923();
         } else {
            var12 = var1.aClass552ArrayArrayArray7287[var15][var5][var6];
            int var17;
            if(var12 == null) {
               if(var15 == 0 || var1.aClass552ArrayArrayArray7287[0][var5][var6] == null) {
                  var12 = var1.aClass552ArrayArrayArray7287[0][var5][var6] = new Class552(0);
               }

               boolean var16 = var1.aClass552ArrayArrayArray7287[0][var5][var6].aClass552_7359 != null;
               if(var15 == 3 && var16) {
                  --var15;
               }

               for(var17 = 1; var17 <= var15; ++var17) {
                  if(var1.aClass552ArrayArrayArray7287[var17][var5][var6] == null) {
                     var12 = var1.aClass552ArrayArrayArray7287[var17][var5][var6] = new Class552(var17);
                     if(var16) {
                        ++var12.aByte7354;
                     }
                  }
               }

               if(var12 == null) {
                  var12 = var1.aClass552ArrayArrayArray7287[var15][var5][var6];
               }
            }

            if(var9.aBool3976) {
               int var20 = this.anInt11552 >> 12;
               var17 = this.anInt11550 >> 12;
               Class550 var18;
               if(var12.aClass639_Sub1_Sub1_7351 != null) {
                  var18 = var12.aClass639_Sub1_Sub1_7351.method9827(var2, -2031336358);
                  if(var18 != null && var18.method6640(var20, var7, var17)) {
                     this.method10923();
                     return;
                  }
               }

               if(var12.aClass639_Sub1_Sub1_7350 != null) {
                  var18 = var12.aClass639_Sub1_Sub1_7350.method9827(var2, -1744931014);
                  if(var18 != null && var18.method6640(var20, var7, var17)) {
                     this.method10923();
                     return;
                  }
               }

               if(var12.aClass639_Sub1_Sub3_7355 != null) {
                  var18 = var12.aClass639_Sub1_Sub3_7355.method9827(var2, -1317511834);
                  if(var18 != null && var18.method6640(var20, var7, var17)) {
                     this.method10923();
                     return;
                  }
               }

               for(Class546 var21 = var12.aClass546_7357; var21 != null; var21 = var21.aClass546_7268) {
                  Class550 var19 = var21.aClass639_Sub1_Sub2_7267.method9827(var2, -1496297595);
                  if(var19 != null && var19.method6640(var20, var7, var17)) {
                     this.method10923();
                     return;
                  }
               }
            }

            var8.aClass177_8084.aClass687_2068.method8060(this, 873680607);
         }
      } else {
         this.method10923();
      }
   }

   void method10923() {
      this.aClass631_12098.aClass614_8221.aClass539_Sub1_Sub1_Sub1Array8076[this.aShort12100] = null;
      Class619.aClass539_Sub1_Sub1_Sub1Array8108[Class619.anInt8110 * -1808272085] = this;
      Class619.anInt8110 = (Class619.anInt8110 * -1808272085 + 1 & 1023) * 1456021891;
      this.method6448(1953189454);
      this.method9247(2053279452);
   }

   void method10924(long var1, int var3) {
      this.aShort12103 = (short)(this.aShort12103 - var3);
      if(this.aShort12103 <= 0) {
         this.method10923();
      } else {
         int var4 = this.anInt11552 >> 12;
         int var5 = this.anInt11545 >> 12;
         int var6 = this.anInt11550 >> 12;
         Class614 var7 = this.aClass631_12098.aClass614_8221;
         Class385 var8 = this.aClass631_12098.aClass385_8220;
         if(var8.anInt3980 * -1851178341 != 0) {
            int var9;
            if(this.aShort12097 - this.aShort12103 <= var8.anInt4026 * -1064403771) {
               var9 = (this.anInt11547 >> 8 & '\uff00') + (this.anInt12099 >> 16 & 255) + var8.anInt4028 * 235004215 * var3;
               int var10 = (this.anInt11547 & '\uff00') + (this.anInt12099 >> 8 & 255) + var8.anInt3990 * -1164968895 * var3;
               int var11 = (this.anInt11547 << 8 & '\uff00') + (this.anInt12099 & 255) + var8.anInt4030 * 1857408581 * var3;
               if(var9 < 0) {
                  var9 = 0;
               } else if(var9 > '\uffff') {
                  var9 = '\uffff';
               }

               if(var10 < 0) {
                  var10 = 0;
               } else if(var10 > '\uffff') {
                  var10 = '\uffff';
               }

               if(var11 < 0) {
                  var11 = 0;
               } else if(var11 > '\uffff') {
                  var11 = '\uffff';
               }

               this.anInt11547 &= -16777216;
               this.anInt11547 |= ((var9 & '\uff00') << 8) + (var10 & '\uff00') + ((var11 & '\uff00') >> 8);
               this.anInt12099 &= -16777216;
               this.anInt12099 |= ((var9 & 255) << 16) + ((var10 & 255) << 8) + (var11 & 255);
            }

            if(this.aShort12097 - this.aShort12103 <= var8.anInt4027 * 343691291) {
               var9 = (this.anInt11547 >> 16 & '\uff00') + (this.anInt12099 >> 24 & 255) + var8.anInt4031 * -241969559 * var3;
               if(var9 < 0) {
                  var9 = 0;
               } else if(var9 > '\uffff') {
                  var9 = '\uffff';
               }

               this.anInt11547 &= 16777215;
               this.anInt11547 |= (var9 & '\uff00') << 16;
               this.anInt12099 &= 16777215;
               this.anInt12099 |= (var9 & 255) << 24;
            }
         }

         if(var8.anInt3971 * -2137982385 != -1 && this.aShort12097 - this.aShort12103 <= var8.anInt3993 * -945140583) {
            this.anInt12095 += var8.anInt3970 * -14713815 * var3;
         }

         if(var8.anInt3975 * 1124265363 != -1 && this.aShort12097 - this.aShort12103 <= var8.anInt4034 * 1519265533) {
            this.anInt11551 += var8.anInt4008 * -611626751 * var3;
         }

         if(this.aShort12104 != 0) {
            this.aShort11553 = (short)(this.aShort11553 + this.aShort12104 * var3 & 16383);
         }

         double var12 = (double)this.aShort12101;
         double var14 = (double)this.aShort12102;
         double var16 = (double)this.aShort12096;
         boolean var18 = false;
         int var19;
         int var20;
         int var21;
         int var22;
         long var23;
         if(var8.anInt3969 * 173024777 == 1) {
            var19 = var4 - this.aClass631_12098.aClass636_8219.anInt8307 * 1564278383;
            var20 = var5 - this.aClass631_12098.aClass636_8219.anInt8300 * 1014761291;
            var21 = var6 - this.aClass631_12098.aClass636_8219.anInt8309 * -1026266877;
            var22 = (int)Math.sqrt((double)(var19 * var19 + var20 * var20 + var21 * var21)) >> 2;
            var23 = (long)(var8.anInt4022 * 2010064011 * var22 * var3);
            this.anInt12095 = (int)((long)this.anInt12095 - ((long)this.anInt12095 * var23 >> 18));
         } else if(var8.anInt3969 * 173024777 == 2) {
            var19 = var4 - this.aClass631_12098.aClass636_8219.anInt8307 * 1564278383;
            var20 = var5 - this.aClass631_12098.aClass636_8219.anInt8300 * 1014761291;
            var21 = var6 - this.aClass631_12098.aClass636_8219.anInt8309 * -1026266877;
            var22 = var19 * var19 + var20 * var20 + var21 * var21;
            var23 = (long)(var8.anInt4022 * 2010064011 * var22 * var3);
            this.anInt12095 = (int)((long)this.anInt12095 - ((long)this.anInt12095 * var23 >> 28));
         }

         Class391 var64;
         Class526_Sub30 var63;
         if(var8.anIntArray3973 != null) {
            Iterator var62 = var7.aList8082.iterator();

            label225:
            while(true) {
               do {
                  if(!var62.hasNext()) {
                     break label225;
                  }

                  var63 = (Class526_Sub30)var62.next();
                  var64 = var63.aClass391_10569;
               } while(var64.anInt4078 * -1760706667 == 1);

               boolean var66 = false;

               for(int var25 = 0; var25 < var8.anIntArray3973.length; ++var25) {
                  if(var8.anIntArray3973[var25] == var64.anInt4077 * -216482513) {
                     var66 = true;
                     break;
                  }
               }

               if(var66) {
                  double var67 = (double)(var4 - var63.anInt10570 * 1900127761);
                  double var26 = (double)(var5 - var63.anInt10571 * 782318679);
                  double var28 = (double)(var6 - var63.anInt10572 * 1409278165);
                  double var30 = var67 * var67 + var26 * var26 + var28 * var28;
                  if(var30 <= (double)(var64.aLong4086 * 3268215641058619031L)) {
                     double var32 = Math.sqrt(var30);
                     if(var32 == 0.0D) {
                        var32 = 1.0D;
                     }

                     double var34 = (var67 * (double)var63.aFloat10573 + var26 * (double)(var64.anInt4081 * 2127383065) + var28 * (double)var63.aFloat10574) * 65535.0D / ((double)(var64.anInt4088 * 992356879) * var32);
                     if(var34 >= (double)(var64.anInt4090 * 201039565)) {
                        double var36 = 0.0D;
                        if(var64.anInt4082 * -1306396573 == 1) {
                           var36 = var32 / 16.0D * (double)(var64.anInt4076 * -449197459);
                        } else if(var64.anInt4082 * -1306396573 == 2) {
                           var36 = var32 / 16.0D * (var32 / 16.0D) * (double)(var64.anInt4076 * -449197459);
                        }

                        if(var64.anInt4084 * -2009146483 == 0) {
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += ((double)var63.aFloat10573 - var36) * (double)var3;
                              var14 += ((double)(var64.anInt4081 * 2127383065) - var36) * (double)var3;
                              var16 += ((double)var63.aFloat10574 - var36) * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + ((double)var63.aFloat10573 - var36) * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + ((double)(var64.anInt4081 * 2127383065) - var36) * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + ((double)var63.aFloat10574 - var36) * (double)var3);
                           }
                        } else {
                           double var38 = var67 / var32 * (double)(var64.anInt4088 * 992356879);
                           double var40 = var26 / var32 * (double)(var64.anInt4088 * 992356879);
                           double var42 = var28 / var32 * (double)(var64.anInt4088 * 992356879);
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += var38 * (double)var3;
                              var14 += var40 * (double)var3;
                              var16 += var42 * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + var38 * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + var40 * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + var42 * (double)var3);
                           }
                        }
                     }
                  }
               }
            }
         }

         if(var8.anIntArray3989 != null) {
            label206:
            for(var19 = 0; var19 < var8.anIntArray3989.length; ++var19) {
               var63 = (Class526_Sub30)Class619.aClass20_8116.get((long)var8.anIntArray3989[var19]);

               while(true) {
                  while(true) {
                     if(var63 == null) {
                        continue label206;
                     }

                     var64 = var63.aClass391_10569;
                     double var44 = (double)(var4 - var63.anInt10570 * 1900127761);
                     double var46 = (double)(var5 - var63.anInt10571 * 782318679);
                     double var48 = (double)(var6 - var63.anInt10572 * 1409278165);
                     double var50 = var44 * var44 + var46 * var46 + var48 * var48;
                     if(var50 > (double)(var64.aLong4086 * 3268215641058619031L)) {
                        var63 = (Class526_Sub30)Class619.aClass20_8116.method635(-1734407897);
                     } else {
                        double var52 = Math.sqrt(var50);
                        if(var52 == 0.0D) {
                           var52 = 1.0D;
                        }

                        double var54;
                        if(var64.anInt4079 * -2040123637 > 0 && var64.anInt4079 * -2040123637 < 2047) {
                           var54 = (var44 * (double)var63.aFloat10573 + var46 * (double)(var64.anInt4081 * 2127383065) + var48 * (double)var63.aFloat10574) * 16384.0D / ((double)(var64.anInt4088 * 992356879) * var52);
                           if(var54 < (double)(var64.anInt4090 * 201039565)) {
                              var63 = (Class526_Sub30)Class619.aClass20_8116.method635(-1734407897);
                              continue;
                           }
                        }

                        var54 = 0.0D;
                        if(var64.anInt4082 * -1306396573 == 1) {
                           var54 = var52 / 16.0D * (double)(var64.anInt4076 * -449197459);
                        } else if(var64.anInt4082 * -1306396573 == 2) {
                           var54 = var52 / 16.0D * (var52 / 16.0D) * (double)(var64.anInt4076 * -449197459);
                        }

                        if(var64.anInt4084 * -2009146483 == 0) {
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += ((double)var63.aFloat10573 - var54) * (double)var3;
                              var14 += ((double)(var64.anInt4081 * 2127383065) - var54) * (double)var3;
                              var16 += ((double)var63.aFloat10574 - var54) * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + ((double)var63.aFloat10573 - var54) * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + ((double)(var64.anInt4081 * 2127383065) - var54) * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + ((double)var63.aFloat10574 - var54) * (double)var3);
                           }
                        } else {
                           double var56 = var44 / var52 * (double)(var64.anInt4088 * 992356879);
                           double var58 = var46 / var52 * (double)(var64.anInt4088 * 992356879);
                           double var60 = var48 / var52 * (double)(var64.anInt4088 * 992356879);
                           if(var64.anInt4075 * 1298462713 == 0) {
                              var12 += var56 * (double)var3;
                              var14 += var58 * (double)var3;
                              var16 += var60 * (double)var3;
                              var18 = true;
                           } else {
                              this.anInt11552 = (int)((double)this.anInt11552 + var56 * (double)var3);
                              this.anInt11545 = (int)((double)this.anInt11545 + var58 * (double)var3);
                              this.anInt11550 = (int)((double)this.anInt11550 + var60 * (double)var3);
                           }
                        }

                        var63 = (Class526_Sub30)Class619.aClass20_8116.method635(-1734407897);
                     }
                  }
               }
            }
         }

         if(var8.anIntArray3984 != null) {
            if(var8.anIntArray3991 == null) {
               var8.anIntArray3991 = new int[var8.anIntArray3984.length];

               for(var19 = 0; var19 < var8.anIntArray3984.length; ++var19) {
                  Class304.anInterface46_3280.method350(var8.anIntArray3984[var19], 540115465);
                  var8.anIntArray3991[var19] = Class130.method1626(var8.anIntArray3984[var19], -1823942640);
               }
            }

            for(var19 = 0; var19 < var8.anIntArray3991.length; ++var19) {
               Class391 var65 = Class619.aClass391Array8118[var8.anIntArray3991[var19]];
               if(var65.anInt4075 * 1298462713 == 0) {
                  var12 += (double)(var65.anInt4080 * -2017397953 * var3);
                  var14 += (double)(var65.anInt4081 * 2127383065 * var3);
                  var16 += (double)(var65.anInt4083 * -1493442421 * var3);
                  var18 = true;
               } else {
                  this.anInt11552 += var65.anInt4080 * -2017397953 * var3;
                  this.anInt11545 += var65.anInt4081 * 2127383065 * var3;
                  this.anInt11550 += var65.anInt4083 * -1493442421 * var3;
               }
            }
         }

         if(var18) {
            while(true) {
               if(var12 <= 32767.0D && var14 <= 32767.0D && var16 <= 32767.0D && var12 >= -32767.0D && var14 >= -32767.0D && var16 >= -32767.0D) {
                  this.aShort12101 = (short)((int)var12);
                  this.aShort12102 = (short)((int)var14);
                  this.aShort12096 = (short)((int)var16);
                  break;
               }

               var12 /= 2.0D;
               var14 /= 2.0D;
               var16 /= 2.0D;
               this.anInt12095 <<= 1;
            }
         }

         this.anInt11552 = (int)((long)this.anInt11552 + ((long)this.aShort12101 * (long)(this.anInt12095 << 2) >> 23) * (long)var3);
         this.anInt11545 = (int)((long)this.anInt11545 + ((long)this.aShort12102 * (long)(this.anInt12095 << 2) >> 23) * (long)var3);
         this.anInt11550 = (int)((long)this.anInt11550 + ((long)this.aShort12096 * (long)(this.anInt12095 << 2) >> 23) * (long)var3);
      }
   }

   Class539_Sub1_Sub1_Sub1(Class631 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, boolean var15, boolean var16) {
      this.aClass631_12098 = var1;
      this.anInt11552 = var2 << 12;
      this.anInt11545 = var3 << 12;
      this.anInt11550 = var4 << 12;
      this.anInt11547 = var10;
      this.aShort12097 = this.aShort12103 = (short)var9;
      this.anInt11551 = var11;
      this.aShort11553 = (short)var12;
      this.aShort12104 = (short)var13;
      this.anInt11548 = var14;
      this.aBool11554 = var16;
      this.aShort12101 = (short)var5;
      this.aShort12102 = (short)var6;
      this.aShort12096 = (short)var7;
      this.anInt12095 = var8;
      this.method10919();
   }
}
