package com.jagex;

import com.jagex.Class195;
import com.jagex.Class231;
import com.jagex.InterfaceDef;
import com.jagex.Class317;
import com.jagex.Class327;
import com.jagex.Class415;
import com.jagex.Class443;
import com.jagex.Class446;
import com.jagex.Class482;
import com.jagex.Class526_Sub21_Sub13_Sub2;
import com.jagex.Class639_Sub1_Sub2_Sub3;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface56;
import com.jagex.client;

class Class186 implements Interface56 {
   public static int anInt2122;
   // $FF: synthetic field
   Class231 this$0;

   public void method370(Object var1, float[] var2, Object[] var3, int var4) {
      Class482 var5 = (Class482)var1;
      Class446 var6 = var5.method5784(-522471607);
      float var7 = var5.method5785((short)25691);
      float var8 = var5.method5791(1244881981);
      Class446 var9 = this.this$0.method3188(-1784066104);
      Class446 var10 = Class446.method5275(var6, var9);
      float var11 = 0.0F;
      int var12 = 8192;
      float var13 = var10.method5276();
      float var14 = 0.0F;
      if(var13 >= var8) {
         var11 = 0.0F;
      } else {
         float var15 = ((Float)var3[0]).floatValue();
         float var16 = ((Float)var3[1]).floatValue();
         float var17;
         if(var9.aFloat4917 > var6.aFloat4917 - var15 / 2.0F && var9.aFloat4917 < var6.aFloat4917 + var15 / 2.0F && var9.aFloat4919 > var6.aFloat4919 - var16 / 2.0F && var9.aFloat4919 < var6.aFloat4919 + var16 / 2.0F) {
            var17 = Math.abs(var9.aFloat4917 - (var6.aFloat4917 + var15 / 2.0F));
            float var18 = Math.abs(var9.aFloat4917 - (var6.aFloat4917 - var15 / 2.0F));
            float var19 = Math.abs(var9.aFloat4919 - (var6.aFloat4917 + var16 / 2.0F));
            float var20 = Math.abs(var9.aFloat4919 - (var6.aFloat4917 - var16 / 2.0F));
            float var21 = var8 - var7;
            float var22 = Math.min(var17, var18);
            float var23 = Math.min(var19, var20);
            float var24 = 1.0F / var21 * var22;
            float var25 = 1.0F / var21 * var23;
            var24 = Math.min(Math.max(var24, 0.0F), 1.0F);
            var25 = Math.min(Math.max(var25, 0.0F), 1.0F);
            var11 = Math.min(var24, var25);
         }

         if(var10.aFloat4917 != 0.0F || var10.aFloat4919 != 0.0F) {
            int var27;
            if(2 == Class327.anInt3488 * -265840483) {
               var17 = Class195.aClass292_Sub1_2182.method3919(1822378599);
               if(0.0F != var10.aFloat4917 || var10.aFloat4919 != 0.0F) {
                  var27 = (int)((double)(var17 * -1.0F) * 2607.5945876176133D) - (int)(Math.atan2((double)var10.aFloat4917, (double)var10.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
                  if(var27 > 8192) {
                     var27 = 16384 - var27;
                  }

                  int var28;
                  if(var13 <= 0.0F) {
                     var28 = 8192;
                  } else if(var13 >= 4096.0F) {
                     var28 = 16384;
                  } else {
                     var28 = (int)(var13 * 8192.0F / 4096.0F + 8192.0F);
                  }

                  var12 = var28 * var27 / 8192 + (16384 - var28 >> 1);
               }

               var14 = 6.1035156E-5F * (float)var12;
            } else {
               int var26 = -(-871798227 * Class317.anInt3410) - (int)(Math.atan2((double)var10.aFloat4917, (double)var10.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
               if(var26 > 8192) {
                  var26 = 16384 - var26;
               }

               if(var13 <= 0.0F) {
                  var27 = 8192;
               } else if(var13 >= 4096.0F) {
                  var27 = 16384;
               } else {
                  var27 = (int)(8192.0F * var13 / 4096.0F + 8192.0F);
               }

               var12 = (16384 - var27 >> 1) + var27 * var26 / 8192;
               var14 = 6.1035156E-5F * (float)var12;
            }
         }
      }

      var2[0] = (float)(var12 < 0?(double)var11:(double)var11 * Math.sqrt((double)(1.0F - var14)));
      var2[1] = (float)(var12 < 0?(double)(-var11):(double)var11 * Math.sqrt((double)var14));
   }

   Class186(Class231 var1) {
      this.this$0 = var1;
   }

   public void method371(Object var1, float[] var2, Object[] var3) {
      Class482 var4 = (Class482)var1;
      Class446 var5 = var4.method5784(107394120);
      float var6 = var4.method5785((short)8091);
      float var7 = var4.method5791(1244881981);
      Class446 var8 = this.this$0.method3188(-987612146);
      Class446 var9 = Class446.method5275(var5, var8);
      float var10 = 0.0F;
      int var11 = 8192;
      float var12 = var9.method5276();
      float var13 = 0.0F;
      if(var12 >= var7) {
         var10 = 0.0F;
      } else {
         float var14 = ((Float)var3[0]).floatValue();
         float var15 = ((Float)var3[1]).floatValue();
         float var16;
         if(var8.aFloat4917 > var5.aFloat4917 - var14 / 2.0F && var8.aFloat4917 < var5.aFloat4917 + var14 / 2.0F && var8.aFloat4919 > var5.aFloat4919 - var15 / 2.0F && var8.aFloat4919 < var5.aFloat4919 + var15 / 2.0F) {
            var16 = Math.abs(var8.aFloat4917 - (var5.aFloat4917 + var14 / 2.0F));
            float var17 = Math.abs(var8.aFloat4917 - (var5.aFloat4917 - var14 / 2.0F));
            float var18 = Math.abs(var8.aFloat4919 - (var5.aFloat4917 + var15 / 2.0F));
            float var19 = Math.abs(var8.aFloat4919 - (var5.aFloat4917 - var15 / 2.0F));
            float var20 = var7 - var6;
            float var21 = Math.min(var16, var17);
            float var22 = Math.min(var18, var19);
            float var23 = 1.0F / var20 * var21;
            float var24 = 1.0F / var20 * var22;
            var23 = Math.min(Math.max(var23, 0.0F), 1.0F);
            var24 = Math.min(Math.max(var24, 0.0F), 1.0F);
            var10 = Math.min(var23, var24);
         }

         if(var9.aFloat4917 != 0.0F || var9.aFloat4919 != 0.0F) {
            int var26;
            if(2 == Class327.anInt3488 * -265840483) {
               var16 = Class195.aClass292_Sub1_2182.method3919(1966176355);
               if(0.0F != var9.aFloat4917 || var9.aFloat4919 != 0.0F) {
                  var26 = (int)((double)(var16 * -1.0F) * 2607.5945876176133D) - (int)(Math.atan2((double)var9.aFloat4917, (double)var9.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
                  if(var26 > 8192) {
                     var26 = 16384 - var26;
                  }

                  int var27;
                  if(var12 <= 0.0F) {
                     var27 = 8192;
                  } else if(var12 >= 4096.0F) {
                     var27 = 16384;
                  } else {
                     var27 = (int)(var12 * 8192.0F / 4096.0F + 8192.0F);
                  }

                  var11 = var27 * var26 / 8192 + (16384 - var27 >> 1);
               }

               var13 = 6.1035156E-5F * (float)var11;
            } else {
               int var25 = -(-871798227 * Class317.anInt3410) - (int)(Math.atan2((double)var9.aFloat4917, (double)var9.aFloat4919) * 2607.5945876176133D) - 4096 & 16383;
               if(var25 > 8192) {
                  var25 = 16384 - var25;
               }

               if(var12 <= 0.0F) {
                  var26 = 8192;
               } else if(var12 >= 4096.0F) {
                  var26 = 16384;
               } else {
                  var26 = (int)(8192.0F * var12 / 4096.0F + 8192.0F);
               }

               var11 = (16384 - var26 >> 1) + var26 * var25 / 8192;
               var13 = 6.1035156E-5F * (float)var11;
            }
         }
      }

      var2[0] = (float)(var11 < 0?(double)var10:(double)var10 * Math.sqrt((double)(1.0F - var13)));
      var2[1] = (float)(var11 < 0?(double)(-var10):(double)var10 * Math.sqrt((double)var13));
   }

   static final void method2718(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class415.method4933(var3, var0, (byte)-10);
   }

   static final void method2719(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(client.anInt11288 * 2029719417 == 2 && var2 < client.anInt11130 * -17244221) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass50Array11290[var2].anInt653 * 799007287;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method2720(Class681 var0, short var1) {
      float var2 = Class443.method5200(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285]);
      Class526_Sub21_Sub13_Sub2 var3 = new Class526_Sub21_Sub13_Sub2(Class195.aClass292_Sub1_2182.method9122(16711935), var2);
      Class195.aClass292_Sub1_2182.method3906(var3, (byte)5);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -631717655 * var3.anInt11813;
   }

   static final void method2721(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class639_Sub1_Sub2_Sub3.method10840(-1450961535);
   }
}
