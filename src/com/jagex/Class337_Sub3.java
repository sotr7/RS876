package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class184_Sub2;
import com.jagex.Class276;
import com.jagex.Class284;
import com.jagex.Class337;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Exception_Sub5_Sub1;
import com.jagex.Exception_Sub5_Sub2;
import com.jagex.Interface23;
import com.jagex.Interface38;

public class Class337_Sub3 extends Class337 {
   static final int anInt10246 = 256;
   Class284 aClass284_10239;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10247;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10251;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10244;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10248;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10245;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10250;
   Class276 aClass276_10240;
   Class276 aClass276_10234;
   Class276 aClass276_10242;
   Class276 aClass276_10243;
   Class276 aClass276_10241;
   boolean aBool10238;
   public static float aFloat10235 = 0.25F;
   public static float aFloat10236 = 1.0F;
   public static float aFloat10237 = 1.0F;
   public static float aFloat10249 = 1.0F;

   int method4376() {
      return 1;
   }

   boolean method4366() {
      return this.aClass174_Sub3_3524.aBool9827 && this.aClass174_Sub3_3524.method8719() && this.aClass174_Sub3_3524.method8720(true);
   }

   boolean method4384() {
      return this.aBool10238;
   }

   boolean method4368() {
      if(this.method4366()) {
         this.aClass284_10239 = this.aClass174_Sub3_3524.method8725("FilterBloom");
         if(this.aClass284_10239 == null) {
            return false;
         } else {
            try {
               this.aClass526_Sub13_Sub1_10247 = this.aClass284_10239.method3750("sceneTex", 2143035756);
               this.aClass526_Sub13_Sub1_10251 = this.aClass284_10239.method3750("bloomTex1", 2144093064);
               this.aClass526_Sub13_Sub1_10244 = this.aClass284_10239.method3750("params", 2121485310);
               this.aClass526_Sub13_Sub1_10248 = this.aClass284_10239.method3750("sampleSize", 2133736861);
               this.aClass526_Sub13_Sub1_10245 = this.aClass284_10239.method3750("pixelOffsetAndBloomScale", 2142846649);
               this.aClass526_Sub13_Sub1_10250 = this.aClass284_10239.method3750("PosAndTexCoords", 2113252274);
               this.aClass284_10239.method3742("test", (byte)41);
               this.aClass276_10240 = this.aClass284_10239.method3742("techFullscreenTri", (byte)33);
               this.aClass276_10234 = this.aClass284_10239.method3742("brightpass", (byte)55);
               this.aClass276_10242 = this.aClass284_10239.method3742("blur", (byte)50);
               this.aClass276_10243 = this.aClass284_10239.method3742("composite", (byte)15);
               this.aClass276_10241 = this.aClass284_10239.method3742("techDefault", (byte)127);
            } catch (Exception_Sub5_Sub1 var2) {
               return false;
            } catch (Exception_Sub5_Sub2 var3) {
               return false;
            }

            if(!this.aClass276_10240.method3638()) {
               return false;
            } else if(!this.aClass276_10234.method3638()) {
               return false;
            } else if(!this.aClass276_10242.method3638()) {
               return false;
            } else if(!this.aClass276_10243.method3638()) {
               return false;
            } else if(!this.aClass276_10241.method3638()) {
               return false;
            } else {
               this.aBool10238 = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   void method4371(int var1, int var2) {
   }

   void method4385() {
   }

   int method4391() {
      return 4;
   }

   void method4372(int var1, Class184_Sub2 var2, Interface38 var3, Interface23 var4, Interface38 var5, boolean var6) {
      float var7 = this.aClass174_Sub3_3524.method8737();
      float var8 = (float)var2.method2691();
      float var9 = (float)var2.method2693();
      Interface38 var10 = var3;
      float var11 = var7 * 2.0F / var8;
      float var12 = -var7 * 2.0F / var9;
      float[] var13 = new float[]{-1.0F + var11, 1.0F + var12, 0.0F, 0.0F, -1.0F + var11, -3.0F + var12, 0.0F, 2.0F, 3.0F + var11, 1.0F + var12, 2.0F, 0.0F};
      int var14 = (int)var8;
      int var15 = (int)var9;
      int var16 = var6?this.aClass174_Sub3_3524.method2248((byte)53).method2691():var14;
      int var17 = var6?this.aClass174_Sub3_3524.method2248((byte)111).method2693():var15;
      if(var1 == 0) {
         var14 = 256;
         var15 = 256;
         this.aClass284_10239.method3757(this.aClass276_10234);
         this.aClass284_10239.method3722();
      } else if(var1 == 1) {
         var14 = 256;
         var15 = 256;
         var16 = var14;
         var17 = var15;
         this.aClass284_10239.method3757(this.aClass276_10242);
         this.aClass284_10239.method3722();
         this.aClass284_10239.method3736(this.aClass526_Sub13_Sub1_10248, aFloat10249 / var8, 0.0F, (byte)-13);
      } else if(var1 == 2) {
         var14 = 256;
         var15 = 256;
         var16 = var14;
         var17 = var15;
         this.aClass284_10239.method3757(this.aClass276_10242);
         this.aClass284_10239.method3722();
         this.aClass284_10239.method3736(this.aClass526_Sub13_Sub1_10248, 0.0F, aFloat10249 / var9, (byte)-122);
      } else if(var1 == 3) {
         this.aClass284_10239.method3757(this.aClass276_10243);
         var10 = var5;
         this.aClass284_10239.method3760(this.aClass526_Sub13_Sub1_10251, 1, var3, (byte)-126);
         this.aClass284_10239.method3722();
      }

      float var18 = (float)var14 / var8;
      float var19 = (float)var15 / var9;
      float var20 = (float)var16 / var8;
      float var21 = (float)var17 / var9;
      var13[8] = (var13[8] + 1.0F) * var18 - 1.0F;
      var13[5] = (var13[5] - 1.0F) * var19 + 1.0F;
      var13[10] *= var20;
      var13[7] *= var21;
      this.aClass284_10239.method3730(this.aClass526_Sub13_Sub1_10250, var13, (short)11418);
      this.aClass284_10239.method3760(this.aClass526_Sub13_Sub1_10247, 0, var10, (byte)-73);
      this.aClass284_10239.method3735(this.aClass526_Sub13_Sub1_10244, aFloat10237, aFloat10235, aFloat10236, 0.0F, (byte)20);
      this.aClass284_10239.method3735(this.aClass526_Sub13_Sub1_10245, 0.0F, 0.0F, 256.0F / var8, 256.0F / var9, (byte)20);
      this.aClass174_Sub3_3524.method2573(0, 0, var14, var15);
   }

   void method4373(int var1) {
      this.aClass284_10239.method3723();
   }

   int method4388() {
      return 0;
   }

   boolean method4370() {
      return this.aBool10238;
   }

   boolean method4379() {
      return false;
   }

   boolean method4374() {
      return this.aClass174_Sub3_3524.aBool9827 && this.aClass174_Sub3_3524.method8719() && this.aClass174_Sub3_3524.method8720(true);
   }

   boolean method4381() {
      return this.aClass174_Sub3_3524.aBool9827 && this.aClass174_Sub3_3524.method8719() && this.aClass174_Sub3_3524.method8720(true);
   }

   boolean method4399() {
      return this.aBool10238;
   }

   void method4394() {
   }

   void method4395() {
   }

   public Class337_Sub3(Class174_Sub3 var1) {
      super(var1);
   }

   void method4403(int var1) {
      this.aClass284_10239.method3723();
   }

   int method4393() {
      return 4;
   }

   void method4389(int var1, int var2) {
   }

   int method4390() {
      return 4;
   }

   int method4398() {
      return 4;
   }

   int method4392() {
      return 4;
   }

   int method4367() {
      return 1;
   }

   void method4386() {
   }

   void method4387() {
   }

   int method4380() {
      return 1;
   }

   void method4401(int var1) {
      this.aClass284_10239.method3723();
   }

   void method4400(int var1, Class184_Sub2 var2, Interface38 var3, Interface23 var4, Interface38 var5, boolean var6) {
      float var7 = this.aClass174_Sub3_3524.method8737();
      float var8 = (float)var2.method2691();
      float var9 = (float)var2.method2693();
      Interface38 var10 = var3;
      float var11 = var7 * 2.0F / var8;
      float var12 = -var7 * 2.0F / var9;
      float[] var13 = new float[]{-1.0F + var11, 1.0F + var12, 0.0F, 0.0F, -1.0F + var11, -3.0F + var12, 0.0F, 2.0F, 3.0F + var11, 1.0F + var12, 2.0F, 0.0F};
      int var14 = (int)var8;
      int var15 = (int)var9;
      int var16 = var6?this.aClass174_Sub3_3524.method2248((byte)37).method2691():var14;
      int var17 = var6?this.aClass174_Sub3_3524.method2248((byte)72).method2693():var15;
      if(var1 == 0) {
         var14 = 256;
         var15 = 256;
         this.aClass284_10239.method3757(this.aClass276_10234);
         this.aClass284_10239.method3722();
      } else if(var1 == 1) {
         var14 = 256;
         var15 = 256;
         var16 = var14;
         var17 = var15;
         this.aClass284_10239.method3757(this.aClass276_10242);
         this.aClass284_10239.method3722();
         this.aClass284_10239.method3736(this.aClass526_Sub13_Sub1_10248, aFloat10249 / var8, 0.0F, (byte)-53);
      } else if(var1 == 2) {
         var14 = 256;
         var15 = 256;
         var16 = var14;
         var17 = var15;
         this.aClass284_10239.method3757(this.aClass276_10242);
         this.aClass284_10239.method3722();
         this.aClass284_10239.method3736(this.aClass526_Sub13_Sub1_10248, 0.0F, aFloat10249 / var9, (byte)-61);
      } else if(var1 == 3) {
         this.aClass284_10239.method3757(this.aClass276_10243);
         var10 = var5;
         this.aClass284_10239.method3760(this.aClass526_Sub13_Sub1_10251, 1, var3, (byte)-126);
         this.aClass284_10239.method3722();
      }

      float var18 = (float)var14 / var8;
      float var19 = (float)var15 / var9;
      float var20 = (float)var16 / var8;
      float var21 = (float)var17 / var9;
      var13[8] = (var13[8] + 1.0F) * var18 - 1.0F;
      var13[5] = (var13[5] - 1.0F) * var19 + 1.0F;
      var13[10] *= var20;
      var13[7] *= var21;
      this.aClass284_10239.method3730(this.aClass526_Sub13_Sub1_10250, var13, (short)4545);
      this.aClass284_10239.method3760(this.aClass526_Sub13_Sub1_10247, 0, var10, (byte)-50);
      this.aClass284_10239.method3735(this.aClass526_Sub13_Sub1_10244, aFloat10237, aFloat10235, aFloat10236, 0.0F, (byte)20);
      this.aClass284_10239.method3735(this.aClass526_Sub13_Sub1_10245, 0.0F, 0.0F, 256.0F / var8, 256.0F / var9, (byte)20);
      this.aClass174_Sub3_3524.method2573(0, 0, var14, var15);
   }

   boolean method4382() {
      if(this.method4366()) {
         this.aClass284_10239 = this.aClass174_Sub3_3524.method8725("FilterBloom");
         if(this.aClass284_10239 == null) {
            return false;
         } else {
            try {
               this.aClass526_Sub13_Sub1_10247 = this.aClass284_10239.method3750("sceneTex", 2115458221);
               this.aClass526_Sub13_Sub1_10251 = this.aClass284_10239.method3750("bloomTex1", 2124352246);
               this.aClass526_Sub13_Sub1_10244 = this.aClass284_10239.method3750("params", 2114710407);
               this.aClass526_Sub13_Sub1_10248 = this.aClass284_10239.method3750("sampleSize", 2144482903);
               this.aClass526_Sub13_Sub1_10245 = this.aClass284_10239.method3750("pixelOffsetAndBloomScale", 2142693822);
               this.aClass526_Sub13_Sub1_10250 = this.aClass284_10239.method3750("PosAndTexCoords", 2101676661);
               this.aClass284_10239.method3742("test", (byte)80);
               this.aClass276_10240 = this.aClass284_10239.method3742("techFullscreenTri", (byte)55);
               this.aClass276_10234 = this.aClass284_10239.method3742("brightpass", (byte)120);
               this.aClass276_10242 = this.aClass284_10239.method3742("blur", (byte)22);
               this.aClass276_10243 = this.aClass284_10239.method3742("composite", (byte)126);
               this.aClass276_10241 = this.aClass284_10239.method3742("techDefault", (byte)102);
            } catch (Exception_Sub5_Sub1 var2) {
               return false;
            } catch (Exception_Sub5_Sub2 var3) {
               return false;
            }

            if(!this.aClass276_10240.method3638()) {
               return false;
            } else if(!this.aClass276_10234.method3638()) {
               return false;
            } else if(!this.aClass276_10242.method3638()) {
               return false;
            } else if(!this.aClass276_10243.method3638()) {
               return false;
            } else if(!this.aClass276_10241.method3638()) {
               return false;
            } else {
               this.aBool10238 = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   void method4402(int var1) {
      this.aClass284_10239.method3723();
   }

   boolean method4383() {
      if(this.method4366()) {
         this.aClass284_10239 = this.aClass174_Sub3_3524.method8725("FilterBloom");
         if(this.aClass284_10239 == null) {
            return false;
         } else {
            try {
               this.aClass526_Sub13_Sub1_10247 = this.aClass284_10239.method3750("sceneTex", 2112496037);
               this.aClass526_Sub13_Sub1_10251 = this.aClass284_10239.method3750("bloomTex1", 2146467265);
               this.aClass526_Sub13_Sub1_10244 = this.aClass284_10239.method3750("params", 2129752028);
               this.aClass526_Sub13_Sub1_10248 = this.aClass284_10239.method3750("sampleSize", 2142758730);
               this.aClass526_Sub13_Sub1_10245 = this.aClass284_10239.method3750("pixelOffsetAndBloomScale", 2101872482);
               this.aClass526_Sub13_Sub1_10250 = this.aClass284_10239.method3750("PosAndTexCoords", 2103184496);
               this.aClass284_10239.method3742("test", (byte)43);
               this.aClass276_10240 = this.aClass284_10239.method3742("techFullscreenTri", (byte)120);
               this.aClass276_10234 = this.aClass284_10239.method3742("brightpass", (byte)122);
               this.aClass276_10242 = this.aClass284_10239.method3742("blur", (byte)83);
               this.aClass276_10243 = this.aClass284_10239.method3742("composite", (byte)20);
               this.aClass276_10241 = this.aClass284_10239.method3742("techDefault", (byte)58);
            } catch (Exception_Sub5_Sub1 var2) {
               return false;
            } catch (Exception_Sub5_Sub2 var3) {
               return false;
            }

            if(!this.aClass276_10240.method3638()) {
               return false;
            } else if(!this.aClass276_10234.method3638()) {
               return false;
            } else if(!this.aClass276_10242.method3638()) {
               return false;
            } else if(!this.aClass276_10243.method3638()) {
               return false;
            } else if(!this.aClass276_10241.method3638()) {
               return false;
            } else {
               this.aBool10238 = true;
               return true;
            }
         }
      } else {
         return false;
      }
   }

   int method4404() {
      return 0;
   }

   boolean method4375() {
      return false;
   }
}
