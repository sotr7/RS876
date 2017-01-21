package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class276;
import com.jagex.Class284;
import com.jagex.Class351;
import com.jagex.Class433;
import com.jagex.Class445;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Exception_Sub5;

public abstract class Class351_Sub1 extends Class351 {
   static final int anInt10176 = 1;
   static final int anInt10180 = 64;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10186;
   static final int anInt10189 = 2;
   static final int anInt10190 = 4;
   static final int anInt10191 = 8;
   static final int anInt10193 = 32;
   static final int anInt10194 = 16;
   static final int anInt10195 = 128;
   protected Class284 aClass284_10182;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10172;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10173;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10174;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10175;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10179;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10197;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10171;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10183;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10177;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10192;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10185;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10187;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10184;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10181;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10178;
   int anInt10196;
   int[] anIntArray10188;
   float[] aFloatArray10200 = new float[3];
   Class433[] aClass433Array10199;
   static Class433 aClass433_10198 = new Class433();

   abstract boolean method9174() throws Exception_Sub5;

   boolean method9175(String var1) throws Exception_Sub5 {
      this.aClass284_10182 = this.aClass174_Sub3_3662.method8725(var1);
      if(this.aClass284_10182 == null) {
         throw new Exception_Sub5("");
      } else {
         this.aClass526_Sub13_Sub1_10172 = this.aClass284_10182.method3752("textureMatrix", (byte)-77);
         this.aClass526_Sub13_Sub1_10173 = this.aClass284_10182.method3752("modelMatrix", (byte)-45);
         this.aClass526_Sub13_Sub1_10174 = this.aClass284_10182.method3752("viewMatrix", (byte)-108);
         this.aClass526_Sub13_Sub1_10175 = this.aClass284_10182.method3752("projectionMatrix", (byte)-28);
         this.aClass526_Sub13_Sub1_10179 = this.aClass284_10182.method3752("modelViewMatrix", (byte)-6);
         this.aClass526_Sub13_Sub1_10197 = this.aClass284_10182.method3752("modelViewProjectionMatrix", (byte)-113);
         this.aClass526_Sub13_Sub1_10171 = this.aClass284_10182.method3752("viewProjectionMatrix", (byte)-110);
         this.aClass526_Sub13_Sub1_10183 = this.aClass284_10182.method3752("ambientColour", (byte)-22);
         this.aClass526_Sub13_Sub1_10177 = this.aClass284_10182.method3752("sunDirection", (byte)-119);
         this.aClass526_Sub13_Sub1_10192 = this.aClass284_10182.method3752("sunColour", (byte)-15);
         this.aClass526_Sub13_Sub1_10185 = this.aClass284_10182.method3752("antiSunColour", (byte)-116);
         this.aClass526_Sub13_Sub1_10187 = this.aClass284_10182.method3752("sunExponent", (byte)-25);
         this.aClass526_Sub13_Sub1_10184 = this.aClass284_10182.method3752("eyePosition", (byte)-58);
         this.aClass526_Sub13_Sub1_10181 = this.aClass284_10182.method3752("eyePositionOS", (byte)-26);
         this.aClass526_Sub13_Sub1_10178 = this.aClass284_10182.method3752("sunDirectionOS", (byte)1);
         if(!this.method9176()) {
            this.aClass284_10182 = null;
            this.aClass526_Sub13_Sub1_10172 = null;
            this.aClass526_Sub13_Sub1_10173 = null;
            this.aClass526_Sub13_Sub1_10174 = null;
            this.aClass526_Sub13_Sub1_10175 = null;
            this.aClass526_Sub13_Sub1_10179 = null;
            this.aClass526_Sub13_Sub1_10197 = null;
            this.aClass526_Sub13_Sub1_10171 = null;
            this.aClass526_Sub13_Sub1_10183 = null;
            this.aClass526_Sub13_Sub1_10177 = null;
            this.aClass526_Sub13_Sub1_10192 = null;
            this.aClass526_Sub13_Sub1_10185 = null;
            this.aClass526_Sub13_Sub1_10187 = null;
            this.aClass526_Sub13_Sub1_10184 = null;
            this.aClass526_Sub13_Sub1_10181 = null;
            this.aClass526_Sub13_Sub1_10178 = null;
            return false;
         } else {
            if(this.aClass284_10182.method3731(-2109459123) == null) {
               Class276 var2 = this.aClass284_10182.method3737(359776483);
               if(var2 == null) {
                  throw new Exception_Sub5(this.aClass284_10182.method3725((short)3317) + "");
               }

               this.aClass284_10182.method3757(var2);
            }

            this.anInt10196 = this.aClass284_10182.method3727(1065977763);
            this.anIntArray10188 = new int[this.anInt10196];
            return true;
         }
      }
   }

   abstract boolean method9176() throws Exception_Sub5;

   void method9177() {
      this.method9183(this.aClass174_Sub3_3662.aBool9744);
      this.method9186(this.aClass174_Sub3_3662.method8797());
      this.method9180();
      this.method4546();
   }

   void method9178() {
      this.method9183(this.aClass174_Sub3_3662.aBool9744);
      this.method9186(this.aClass174_Sub3_3662.method8797());
      this.method9180();
      this.method4546();
   }

   void method9179(int var1) {
      for(int var2 = 0; var2 < this.anInt10196; ++var2) {
         this.anIntArray10188[var2] |= 128 << var1;
      }

   }

   void method9180() {
      if(this.aClass284_10182 != null && this.aClass284_10182.method3724()) {
         int var1 = this.aClass284_10182.method3732(-485067968);
         int var2 = this.anIntArray10188[var1];
         if((var2 & 1) != 0 && this.aClass526_Sub13_Sub1_10173 != null) {
            this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10173, this.aClass174_Sub3_3662.method8758(), (byte)-54);
         }

         if((var2 & 2) != 0) {
            if(this.aClass526_Sub13_Sub1_10174 != null) {
               this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10174, this.aClass174_Sub3_3662.method8853(), (byte)-123);
            }

            if(this.aClass526_Sub13_Sub1_10184 != null) {
               this.aFloatArray10200[0] = 0.0F;
               this.aFloatArray10200[1] = 0.0F;
               this.aFloatArray10200[2] = 0.0F;
               this.aClass174_Sub3_3662.method2372().method5258(this.aFloatArray10200[0], this.aFloatArray10200[1], this.aFloatArray10200[2], this.aFloatArray10200);
               this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10184, this.aFloatArray10200[0], this.aFloatArray10200[1], this.aFloatArray10200[2], -1514081739);
            }
         }

         if((var2 & 16) != 0 && this.aClass526_Sub13_Sub1_10179 != null) {
            this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10179, this.aClass174_Sub3_3662.method8792(), (byte)-22);
         }

         if((var2 & 8) != 0 && this.aClass526_Sub13_Sub1_10186 != null) {
            this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10186, this.aClass174_Sub3_3662.method8755(), (byte)-60);
         }

         if((var2 & 4) != 0 && this.aClass526_Sub13_Sub1_10175 != null) {
            this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10175, this.aClass174_Sub3_3662.method8760(), (byte)-88);
         }

         if((var2 & 32) != 0 && this.aClass526_Sub13_Sub1_10197 != null) {
            aClass433_10198.method5118(this.aClass174_Sub3_3662.method8792(), this.aClass174_Sub3_3662.method8760());
            this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10197, aClass433_10198, (byte)-15);
         }

         if((var2 & 64) != 0 && this.aClass526_Sub13_Sub1_10171 != null) {
            aClass433_10198.method5118(this.aClass174_Sub3_3662.method8853(), this.aClass174_Sub3_3662.method8760());
            this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10171, aClass433_10198, (byte)-23);
         }

         if(this.aClass174_Sub3_3662.method8935() == 0 && (this.anIntArray10188[var1] & 128) != 0 && this.aClass526_Sub13_Sub1_10172 != null) {
            this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_10172, this.aClass174_Sub3_3662.method8797(), -673765190);
            this.anIntArray10188[var1] &= -129;
         }

         this.anIntArray10188[var1] = 0;
      }

   }

   void method9181(int var1, Class445 var2) {
      if(this.aClass526_Sub13_Sub1_10181 != null) {
         Class433 var3 = this.aClass174_Sub3_3662.method8755();
         float[] var4 = new float[]{var3.aFloatArray4841[12], var3.aFloatArray4841[13], var3.aFloatArray4841[14]};
         float[] var5 = new float[]{0.0F, 0.0F, 0.0F};
         var3.method5090(var5);
         float[] var6 = new float[]{0.0F, 0.0F, 0.0F};
         this.aClass174_Sub3_3662.method2372().method5233(0.0F, 0.0F, 0.0F, var6);
         var2.method5234(var4);
         this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10181, var4[0], var4[1], var4[2], -1514081739);
      }

   }

   void method9182(int var1, Class445 var2) {
      if(this.aClass526_Sub13_Sub1_10178 != null) {
         float[] var3 = new float[]{this.aClass174_Sub3_3662.aFloatArray9777[0], this.aClass174_Sub3_3662.aFloatArray9777[1], this.aClass174_Sub3_3662.aFloatArray9777[2]};
         var2.method5227(var3);
         this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10178, var3[0], var3[1], var3[2], -1514081739);
      }

   }

   void method9183(boolean var1) {
      if(this.aClass284_10182 != null && this.aClass284_10182.method3724()) {
         if(this.aClass526_Sub13_Sub1_10183 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10183, this.aClass174_Sub3_3662.aFloat9708 * this.aClass174_Sub3_3662.aFloat9669, this.aClass174_Sub3_3662.aFloat9771 * this.aClass174_Sub3_3662.aFloat9669, this.aClass174_Sub3_3662.aFloat9760 * this.aClass174_Sub3_3662.aFloat9669, -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10177 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10177, this.aClass174_Sub3_3662.aFloatArray9777[0], this.aClass174_Sub3_3662.aFloatArray9777[1], this.aClass174_Sub3_3662.aFloatArray9777[2], -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10192 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10192, this.aClass174_Sub3_3662.aFloat9708 * this.aClass174_Sub3_3662.aFloat9823, this.aClass174_Sub3_3662.aFloat9771 * this.aClass174_Sub3_3662.aFloat9823, this.aClass174_Sub3_3662.aFloat9760 * this.aClass174_Sub3_3662.aFloat9823, -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10185 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10185, -this.aClass174_Sub3_3662.aFloat9708 * this.aClass174_Sub3_3662.aFloat9763, -this.aClass174_Sub3_3662.aFloat9771 * this.aClass174_Sub3_3662.aFloat9763, -this.aClass174_Sub3_3662.aFloat9760 * this.aClass174_Sub3_3662.aFloat9763, -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10187 != null) {
            this.aClass284_10182.method3772(this.aClass526_Sub13_Sub1_10187, 64.0F + Math.abs(this.aClass174_Sub3_3662.aFloatArray9777[1]) * 928.0F, 745915600);
         }
      }

   }

   void method4546() {
   }

   Class351_Sub1(Class174_Sub3 var1) {
      super(var1);
      new Class445();
      this.aClass433Array10199 = new Class433[this.aClass174_Sub3_3662.anInt9683];

      for(int var2 = 0; var2 < this.aClass174_Sub3_3662.anInt9683; ++var2) {
         this.aClass433Array10199[var2] = new Class433();
      }

   }

   void method9184(Class445 var1) {
      Class433 var2 = this.aClass174_Sub3_3662.aClass433_9705;
      var2.method5110(var1);
      int var3 = this.aClass284_10182.method3732(811342100);
      if(this.aClass526_Sub13_Sub1_10173 != null) {
         this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10173, var2, (byte)-36);
         this.anIntArray10188[var3] &= -2;
      }

      if(this.aClass526_Sub13_Sub1_10179 != null) {
         aClass433_10198.method5118(var2, this.aClass174_Sub3_3662.method8853());
         this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10179, aClass433_10198, (byte)-108);
         this.anIntArray10188[var3] &= -17;
      }

      if(this.aClass526_Sub13_Sub1_10197 != null) {
         aClass433_10198.method5118(var2, this.aClass174_Sub3_3662.method8859());
         this.aClass284_10182.method3741(this.aClass526_Sub13_Sub1_10197, aClass433_10198, (byte)-46);
         this.anIntArray10188[var3] &= -33;
      }

      this.method9181(var3, var1);
      this.method9182(var3, var1);
   }

   void method4558() {
      this.method9184(Class445.aClass445_4903);
   }

   void method9185(int var1) {
      this.aClass433Array10199[0].method5104();
      this.method9188(var1);
   }

   void method4548() {
      this.aClass284_10182.method3722();
      this.anIntArray10188[this.aClass284_10182.method3732(-1046138200)] = -1;
      this.method9185(0);
      this.method9178();
   }

   void method4543() {
      if(this.aClass284_10182 != null) {
         this.aClass284_10182.method3723();
      }

   }

   void method4541() {
      this.method9184(Class445.aClass445_4903);
   }

   void method4556() {
      if(this.aClass284_10182 != null) {
         this.aClass284_10182.method3723();
      }

   }

   void method9186(Class433 var1) {
      if(this.aClass284_10182 != null && this.aClass284_10182.method3724() && this.aClass174_Sub3_3662.method8935() == 0) {
         int var2 = this.aClass284_10182.method3732(-771716181);
         if((this.anIntArray10188[var2] & 128) != 0 && this.aClass526_Sub13_Sub1_10172 != null) {
            this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_10172, var1, -347305045);
            this.anIntArray10188[var2] &= -129;
         }
      }

   }

   void method4550() {
      if(this.aClass284_10182 != null) {
         this.aClass284_10182.method3723();
      }

   }

   void method4549() {
      if(this.aClass284_10182 != null) {
         this.aClass284_10182.method3723();
      }

   }

   void method4551() {
      this.aClass284_10182.method3722();
      this.anIntArray10188[this.aClass284_10182.method3732(-1937487861)] = -1;
      this.method9185(0);
      this.method9178();
   }

   void method9187(Class433 var1) {
      if(this.aClass284_10182 != null && this.aClass284_10182.method3724() && this.aClass174_Sub3_3662.method8935() == 0) {
         int var2 = this.aClass284_10182.method3732(-1451914614);
         if((this.anIntArray10188[var2] & 128) != 0 && this.aClass526_Sub13_Sub1_10172 != null) {
            this.aClass284_10182.method3740(this.aClass526_Sub13_Sub1_10172, var1, -1386247378);
            this.anIntArray10188[var2] &= -129;
         }
      }

   }

   void method9188(int var1) {
      for(int var2 = 0; var2 < this.anInt10196; ++var2) {
         this.anIntArray10188[var2] |= 128 << var1;
      }

   }

   void method4562() {
   }

   void method9189(boolean var1) {
      if(this.aClass284_10182 != null && this.aClass284_10182.method3724()) {
         if(this.aClass526_Sub13_Sub1_10183 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10183, this.aClass174_Sub3_3662.aFloat9708 * this.aClass174_Sub3_3662.aFloat9669, this.aClass174_Sub3_3662.aFloat9771 * this.aClass174_Sub3_3662.aFloat9669, this.aClass174_Sub3_3662.aFloat9760 * this.aClass174_Sub3_3662.aFloat9669, -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10177 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10177, this.aClass174_Sub3_3662.aFloatArray9777[0], this.aClass174_Sub3_3662.aFloatArray9777[1], this.aClass174_Sub3_3662.aFloatArray9777[2], -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10192 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10192, this.aClass174_Sub3_3662.aFloat9708 * this.aClass174_Sub3_3662.aFloat9823, this.aClass174_Sub3_3662.aFloat9771 * this.aClass174_Sub3_3662.aFloat9823, this.aClass174_Sub3_3662.aFloat9760 * this.aClass174_Sub3_3662.aFloat9823, -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10185 != null) {
            this.aClass284_10182.method3769(this.aClass526_Sub13_Sub1_10185, -this.aClass174_Sub3_3662.aFloat9708 * this.aClass174_Sub3_3662.aFloat9763, -this.aClass174_Sub3_3662.aFloat9771 * this.aClass174_Sub3_3662.aFloat9763, -this.aClass174_Sub3_3662.aFloat9760 * this.aClass174_Sub3_3662.aFloat9763, -1514081739);
         }

         if(this.aClass526_Sub13_Sub1_10187 != null) {
            this.aClass284_10182.method3772(this.aClass526_Sub13_Sub1_10187, 64.0F + Math.abs(this.aClass174_Sub3_3662.aFloatArray9777[1]) * 928.0F, 745915600);
         }
      }

   }

   void method4557() {
   }

   void method9190(int var1) {
      this.aClass433Array10199[0].method5104();
      this.method9188(var1);
   }

   void method9191(int var1) {
      this.aClass433Array10199[0].method5104();
      this.method9188(var1);
   }
}
