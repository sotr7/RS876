package com.jagex;

import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub3;
import com.jagex.Class234;
import com.jagex.Class402_Sub1_Sub2;
import com.jagex.Class402_Sub2_Sub1;
import com.jagex.Class460;
import com.jagex.Class51;
import com.jagex.Class527_Sub1;
import com.jagex.Class543;
import com.jagex.Interface37;
import com.jagex.Interface38;

public class Class344 {
   static final int anInt3565 = 128;
   public static final int anInt3567 = 16;
   static final int anInt3576 = 128;
   static Object anObject3577;
   public Interface37 anInterface37_3566 = null;
   Interface38[] anInterface38Array3574 = null;
   Interface37 anInterface37_3571 = null;
   public Interface38[] anInterface38Array3572 = null;
   public Interface37 anInterface37_3573 = null;
   Class174_Sub3 aClass174_Sub3_3568;
   public boolean aBool3569;
   static Object anObject3575;
   static Object anObject3570;

   public boolean method4434() {
      if(!this.aClass174_Sub3_3568.aBool9832) {
         return false;
      } else {
         if(this.anInterface37_3566 == null) {
            byte[] var1;
            if(anObject3577 == null) {
               var1 = Class543.method6492(128, 128, 16, 8, new Class527_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
               anObject3577 = Class234.method3275(var1, false, 40364120);
            }

            var1 = Class460.method5464(anObject3577, false, -385818963);
            byte[] var2 = new byte[var1.length * 4];
            int var3 = 0;

            for(int var4 = 0; var4 < 16; ++var4) {
               int var5 = var4 * 16384;
               int var6 = var5;

               for(int var7 = 0; var7 < 128; ++var7) {
                  int var8 = var6 + var7 * 128;
                  int var9 = var6 + (var7 - 1 & 127) * 128;
                  int var10 = var6 + (var7 + 1 & 127) * 128;

                  for(int var11 = 0; var11 < 128; ++var11) {
                     float var12 = (float)((var1[var9 + var11] & 255) - (var1[var10 + var11] & 255));
                     float var13 = (float)((var1[var8 + (var11 - 1 & 127)] & 255) - (var1[var8 + (var11 + 1 & 127)] & 255));
                     float var14 = (float)(128.0D / Math.sqrt((double)(var13 * var13 + 16384.0F + var12 * var12)));
                     var2[var3++] = (byte)((int)(var13 * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(128.0F * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(var12 * var14 + 127.0F));
                     var2[var3++] = var1[var5++];
                  }
               }
            }

            this.anInterface37_3566 = this.aClass174_Sub3_3568.method8953(Class144.aClass144_1680, 128, 128, 16, true, var2);
         }

         return this.anInterface37_3566 != null;
      }
   }

   Class344(Class174_Sub3 var1) {
      this.aClass174_Sub3_3568 = var1;
      this.aBool3569 = this.aClass174_Sub3_3568.aBool9832;
      if(this.aBool3569 && !this.aClass174_Sub3_3568.aBool9724) {
         this.aBool3569 = false;
      }

      if(this.aBool3569 && !this.aClass174_Sub3_3568.method8844(Class144.aClass144_1683, Class166.aClass166_1884)) {
         this.aBool3569 = false;
      }

      if(this.aBool3569 || this.aClass174_Sub3_3568.method8744(Class144.aClass144_1683, Class166.aClass166_1884)) {
         method4439();
         if(!this.aBool3569) {
            this.anInterface38Array3574 = new Interface38[16];

            int var2;
            byte[] var3;
            for(var2 = 0; var2 < 16; ++var2) {
               var3 = Class51.method956(anObject3575, var2 * '\u8000', '\u8000', 1402412508);
               this.anInterface38Array3574[var2] = this.aClass174_Sub3_3568.method8740(Class144.aClass144_1683, 128, 128, true, var3);
            }

            this.anInterface38Array3572 = new Interface38[16];

            for(var2 = 0; var2 < 16; ++var2) {
               var3 = Class51.method956(anObject3570, var2 * '\u8000', '\u8000', 1705677727);
               this.anInterface38Array3572[var2] = this.aClass174_Sub3_3568.method8740(Class144.aClass144_1683, 128, 128, true, var3);
            }
         } else {
            byte[] var4 = Class460.method5464(anObject3575, false, 1780755127);
            this.anInterface37_3571 = this.aClass174_Sub3_3568.method8953(Class144.aClass144_1683, 128, 128, 16, true, var4);
            var4 = Class460.method5464(anObject3570, false, -289444054);
            this.anInterface37_3573 = this.aClass174_Sub3_3568.method8953(Class144.aClass144_1683, 128, 128, 16, true, var4);
         }

      }
   }

   public boolean method4435() {
      return this.aBool3569?this.anInterface37_3571 != null:this.anInterface38Array3574 != null;
   }

   public boolean method4436() {
      if(!this.aClass174_Sub3_3568.aBool9832) {
         return false;
      } else {
         if(this.anInterface37_3566 == null) {
            byte[] var1;
            if(anObject3577 == null) {
               var1 = Class543.method6492(128, 128, 16, 8, new Class527_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
               anObject3577 = Class234.method3275(var1, false, -260358565);
            }

            var1 = Class460.method5464(anObject3577, false, 1825047015);
            byte[] var2 = new byte[var1.length * 4];
            int var3 = 0;

            for(int var4 = 0; var4 < 16; ++var4) {
               int var5 = var4 * 16384;
               int var6 = var5;

               for(int var7 = 0; var7 < 128; ++var7) {
                  int var8 = var6 + var7 * 128;
                  int var9 = var6 + (var7 - 1 & 127) * 128;
                  int var10 = var6 + (var7 + 1 & 127) * 128;

                  for(int var11 = 0; var11 < 128; ++var11) {
                     float var12 = (float)((var1[var9 + var11] & 255) - (var1[var10 + var11] & 255));
                     float var13 = (float)((var1[var8 + (var11 - 1 & 127)] & 255) - (var1[var8 + (var11 + 1 & 127)] & 255));
                     float var14 = (float)(128.0D / Math.sqrt((double)(var13 * var13 + 16384.0F + var12 * var12)));
                     var2[var3++] = (byte)((int)(var13 * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(128.0F * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(var12 * var14 + 127.0F));
                     var2[var3++] = var1[var5++];
                  }
               }
            }

            this.anInterface37_3566 = this.aClass174_Sub3_3568.method8953(Class144.aClass144_1680, 128, 128, 16, true, var2);
         }

         return this.anInterface37_3566 != null;
      }
   }

   public boolean method4437() {
      return this.aBool3569?this.anInterface37_3571 != null:this.anInterface38Array3574 != null;
   }

   public boolean method4438() {
      return this.aBool3569?this.anInterface37_3571 != null:this.anInterface38Array3574 != null;
   }

   static void method4439() {
      byte[] var1;
      if(anObject3575 == null) {
         Class402_Sub2_Sub1 var0 = new Class402_Sub2_Sub1();
         var1 = var0.method10472(128, 128, 16);
         anObject3575 = Class234.method3275(var1, false, 1647071474);
      }

      if(anObject3570 == null) {
         Class402_Sub1_Sub2 var2 = new Class402_Sub1_Sub2();
         var1 = var2.method10542(128, 128, 16);
         anObject3570 = Class234.method3275(var1, false, 1530466560);
      }

   }

   static void method4440() {
      byte[] var1;
      if(anObject3575 == null) {
         Class402_Sub2_Sub1 var0 = new Class402_Sub2_Sub1();
         var1 = var0.method10472(128, 128, 16);
         anObject3575 = Class234.method3275(var1, false, -512960715);
      }

      if(anObject3570 == null) {
         Class402_Sub1_Sub2 var2 = new Class402_Sub1_Sub2();
         var1 = var2.method10542(128, 128, 16);
         anObject3570 = Class234.method3275(var1, false, 1832051724);
      }

   }

   public boolean method4441() {
      return this.aBool3569?this.anInterface37_3571 != null:this.anInterface38Array3574 != null;
   }

   public boolean method4442() {
      if(!this.aClass174_Sub3_3568.aBool9832) {
         return false;
      } else {
         if(this.anInterface37_3566 == null) {
            byte[] var1;
            if(anObject3577 == null) {
               var1 = Class543.method6492(128, 128, 16, 8, new Class527_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
               anObject3577 = Class234.method3275(var1, false, 1539933362);
            }

            var1 = Class460.method5464(anObject3577, false, -233601420);
            byte[] var2 = new byte[var1.length * 4];
            int var3 = 0;

            for(int var4 = 0; var4 < 16; ++var4) {
               int var5 = var4 * 16384;
               int var6 = var5;

               for(int var7 = 0; var7 < 128; ++var7) {
                  int var8 = var6 + var7 * 128;
                  int var9 = var6 + (var7 - 1 & 127) * 128;
                  int var10 = var6 + (var7 + 1 & 127) * 128;

                  for(int var11 = 0; var11 < 128; ++var11) {
                     float var12 = (float)((var1[var9 + var11] & 255) - (var1[var10 + var11] & 255));
                     float var13 = (float)((var1[var8 + (var11 - 1 & 127)] & 255) - (var1[var8 + (var11 + 1 & 127)] & 255));
                     float var14 = (float)(128.0D / Math.sqrt((double)(var13 * var13 + 16384.0F + var12 * var12)));
                     var2[var3++] = (byte)((int)(var13 * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(128.0F * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(var12 * var14 + 127.0F));
                     var2[var3++] = var1[var5++];
                  }
               }
            }

            this.anInterface37_3566 = this.aClass174_Sub3_3568.method8953(Class144.aClass144_1680, 128, 128, 16, true, var2);
         }

         return this.anInterface37_3566 != null;
      }
   }

   public boolean method4443() {
      if(!this.aClass174_Sub3_3568.aBool9832) {
         return false;
      } else {
         if(this.anInterface37_3566 == null) {
            byte[] var1;
            if(anObject3577 == null) {
               var1 = Class543.method6492(128, 128, 16, 8, new Class527_Sub1(419684), 4.0F, 4.0F, 16.0F, 0.5F, 0.6F);
               anObject3577 = Class234.method3275(var1, false, 177631315);
            }

            var1 = Class460.method5464(anObject3577, false, 839482148);
            byte[] var2 = new byte[var1.length * 4];
            int var3 = 0;

            for(int var4 = 0; var4 < 16; ++var4) {
               int var5 = var4 * 16384;
               int var6 = var5;

               for(int var7 = 0; var7 < 128; ++var7) {
                  int var8 = var6 + var7 * 128;
                  int var9 = var6 + (var7 - 1 & 127) * 128;
                  int var10 = var6 + (var7 + 1 & 127) * 128;

                  for(int var11 = 0; var11 < 128; ++var11) {
                     float var12 = (float)((var1[var9 + var11] & 255) - (var1[var10 + var11] & 255));
                     float var13 = (float)((var1[var8 + (var11 - 1 & 127)] & 255) - (var1[var8 + (var11 + 1 & 127)] & 255));
                     float var14 = (float)(128.0D / Math.sqrt((double)(var13 * var13 + 16384.0F + var12 * var12)));
                     var2[var3++] = (byte)((int)(var13 * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(128.0F * var14 + 127.0F));
                     var2[var3++] = (byte)((int)(var12 * var14 + 127.0F));
                     var2[var3++] = var1[var5++];
                  }
               }
            }

            this.anInterface37_3566 = this.aClass174_Sub3_3568.method8953(Class144.aClass144_1680, 128, 128, 16, true, var2);
         }

         return this.anInterface37_3566 != null;
      }
   }
}
