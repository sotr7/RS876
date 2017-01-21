package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class176_Sub1;
import com.jagex.Class184_Sub2;
import com.jagex.Class276;
import com.jagex.Class284;
import com.jagex.Class337;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Exception_Sub5_Sub1;
import com.jagex.Exception_Sub5_Sub2;
import com.jagex.Interface23;
import com.jagex.Interface38;
import com.jagex.Interface41;

public class Class337_Sub2 extends Class337 {
   Class276[] aClass276Array10145 = null;
   Class526_Sub13_Sub1[] aClass526_Sub13_Sub1Array10146 = null;
   public static float[] aFloatArray10147 = new float[]{0.0F, 0.0F, 0.0F};
   public static float aFloat10141 = 1.0F;
   public static int anInt10140 = 1;
   public static Class176_Sub1[] aClass176_Sub1Array10143 = new Class176_Sub1[]{null, null, null};
   Class284 aClass284_10144;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10142;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10148;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10149;
   Class526_Sub13_Sub1 aClass526_Sub13_Sub1_10150;
   boolean aBool10151;

   int method4393() {
      return 1;
   }

   boolean method4366() {
      return this.aClass174_Sub3_3524.aBool9827 && this.aClass174_Sub3_3524.method8719();
   }

   int method4390() {
      return 1;
   }

   public Class337_Sub2(Class174_Sub3 var1) {
      super(var1);
   }

   void method4371(int var1, int var2) {
   }

   void method4385() {
   }

   int method4391() {
      return 1;
   }

   void method4372(int var1, Class184_Sub2 var2, Interface38 var3, Interface23 var4, Interface38 var5, boolean var6) {
      float var7 = this.aClass174_Sub3_3524.method8737();
      float var8 = (float)var2.method2691();
      float var9 = (float)var2.method2693();
      float var11 = var7 * 2.0F / var8;
      float var12 = -var7 * 2.0F / var9;
      float[] var13 = new float[]{-1.0F + var11, 1.0F + var12, 0.0F, 0.0F, -1.0F + var11, -3.0F + var12, 0.0F, 2.0F, 3.0F + var11, 1.0F + var12, 2.0F, 0.0F};
      int var14 = (int)var8;
      int var15 = (int)var9;
      int var16 = var6?this.aClass174_Sub3_3524.method2248((byte)11).method2691():var14;
      int var17 = var6?this.aClass174_Sub3_3524.method2248((byte)17).method2693():var15;
      Class276 var18 = this.aClass276Array10145[anInt10140 - 1];
      this.aClass284_10144.method3757(var18);
      this.aClass284_10144.method3722();
      this.aClass284_10144.method3735(this.aClass526_Sub13_Sub1_10148, aFloat10141, aFloatArray10147[0], aFloatArray10147[1], aFloatArray10147[2], (byte)20);
      Interface41 var19 = null;
      Class526_Sub13_Sub1 var20 = null;

      for(int var21 = 0; var21 < anInt10140; ++var21) {
         if(aClass176_Sub1Array10143[var21] != null) {
            var20 = this.aClass526_Sub13_Sub1Array10146[var21];
            var19 = aClass176_Sub1Array10143[var21].method8408();
            this.aClass284_10144.method3760(var20, var21 + 1, var19, (byte)-83);
         }
      }

      float var25 = (float)var14 / var8;
      float var22 = (float)var15 / var9;
      float var23 = (float)var16 / var8;
      float var24 = (float)var17 / var9;
      var13[8] = (var13[8] + 1.0F) * var25 - 1.0F;
      var13[5] = (var13[5] - 1.0F) * var22 + 1.0F;
      var13[10] *= var23;
      var13[7] *= var24;
      this.aClass284_10144.method3730(this.aClass526_Sub13_Sub1_10150, var13, (short)-8282);
      this.aClass284_10144.method3760(this.aClass526_Sub13_Sub1_10142, 0, var3, (byte)-11);
      this.aClass284_10144.method3735(this.aClass526_Sub13_Sub1_10149, 0.0F, 0.0F, 0.0F, 0.0F, (byte)20);
      this.aClass174_Sub3_3524.method2573(0, 0, var14, var15);
   }

   void method4373(int var1) {
      this.aClass284_10144.method3723();
   }

   int method4376() {
      return 0;
   }

   int method4388() {
      return 2;
   }

   boolean method4375() {
      return anInt10140 == 0 || aFloat10141 == 1.0F || aFloatArray10147[0] + aFloatArray10147[1] + aFloatArray10147[2] == 0.0F || aClass176_Sub1Array10143[0] == null && aClass176_Sub1Array10143[1] == null && aClass176_Sub1Array10143[2] == null;
   }

   boolean method4374() {
      return this.aClass174_Sub3_3524.aBool9827 && this.aClass174_Sub3_3524.method8719();
   }

   void method4395() {
   }

   boolean method4382() {
      if(this.method4366()) {
         this.aClass284_10144 = this.aClass174_Sub3_3524.method8725("FilterColourRemapping");
         if(this.aClass284_10144 == null) {
            return false;
         } else {
            try {
               this.aClass526_Sub13_Sub1_10142 = this.aClass284_10144.method3750("sceneTex", 2131631596);
               this.aClass276Array10145 = new Class276[3];
               this.aClass526_Sub13_Sub1Array10146 = new Class526_Sub13_Sub1[3];
               if(this.aClass174_Sub3_3524.aBool9832) {
                  this.aClass276Array10145[0] = this.aClass284_10144.method3742("techRemap3D_1", (byte)72);
                  this.aClass276Array10145[1] = this.aClass284_10144.method3742("techRemap3D_2", (byte)104);
                  this.aClass276Array10145[2] = this.aClass284_10144.method3742("techRemap3D_3", (byte)36);
                  this.aClass526_Sub13_Sub1Array10146[0] = this.aClass284_10144.method3750("remapTex3D_1", 2108638009);
                  this.aClass526_Sub13_Sub1Array10146[1] = this.aClass284_10144.method3750("remapTex3D_2", 2143292654);
                  this.aClass526_Sub13_Sub1Array10146[2] = this.aClass284_10144.method3750("remapTex3D_3", 2126958095);
               } else {
                  this.aClass276Array10145[0] = this.aClass284_10144.method3742("techRemap2D_1", (byte)97);
                  this.aClass276Array10145[1] = this.aClass284_10144.method3742("techRemap2D_2", (byte)57);
                  this.aClass276Array10145[2] = this.aClass284_10144.method3742("techRemap2D_3", (byte)71);
                  this.aClass526_Sub13_Sub1Array10146[0] = this.aClass284_10144.method3750("remapTex2D_1", 2128281967);
                  this.aClass526_Sub13_Sub1Array10146[1] = this.aClass284_10144.method3750("remapTex2D_2", 2129717419);
                  this.aClass526_Sub13_Sub1Array10146[2] = this.aClass284_10144.method3750("remapTex2D_3", 2119977484);
               }

               this.aClass526_Sub13_Sub1_10148 = this.aClass284_10144.method3750("paramsWeightings", 2145692533);
               this.aClass526_Sub13_Sub1_10149 = this.aClass284_10144.method3750("pixelOffset", 2126761972);
               this.aClass526_Sub13_Sub1_10150 = this.aClass284_10144.method3750("PosAndTexCoords", 2130839547);
            } catch (Exception_Sub5_Sub1 var2) {
               return false;
            } catch (Exception_Sub5_Sub2 var3) {
               return false;
            }

            if(this.aClass276Array10145[0].method3638() && this.aClass276Array10145[1].method3638() && this.aClass276Array10145[2].method3638()) {
               this.aBool10151 = true;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   boolean method4383() {
      if(this.method4366()) {
         this.aClass284_10144 = this.aClass174_Sub3_3524.method8725("FilterColourRemapping");
         if(this.aClass284_10144 == null) {
            return false;
         } else {
            try {
               this.aClass526_Sub13_Sub1_10142 = this.aClass284_10144.method3750("sceneTex", 2118819423);
               this.aClass276Array10145 = new Class276[3];
               this.aClass526_Sub13_Sub1Array10146 = new Class526_Sub13_Sub1[3];
               if(this.aClass174_Sub3_3524.aBool9832) {
                  this.aClass276Array10145[0] = this.aClass284_10144.method3742("techRemap3D_1", (byte)48);
                  this.aClass276Array10145[1] = this.aClass284_10144.method3742("techRemap3D_2", (byte)33);
                  this.aClass276Array10145[2] = this.aClass284_10144.method3742("techRemap3D_3", (byte)12);
                  this.aClass526_Sub13_Sub1Array10146[0] = this.aClass284_10144.method3750("remapTex3D_1", 2137134151);
                  this.aClass526_Sub13_Sub1Array10146[1] = this.aClass284_10144.method3750("remapTex3D_2", 2120650637);
                  this.aClass526_Sub13_Sub1Array10146[2] = this.aClass284_10144.method3750("remapTex3D_3", 2132876863);
               } else {
                  this.aClass276Array10145[0] = this.aClass284_10144.method3742("techRemap2D_1", (byte)20);
                  this.aClass276Array10145[1] = this.aClass284_10144.method3742("techRemap2D_2", (byte)74);
                  this.aClass276Array10145[2] = this.aClass284_10144.method3742("techRemap2D_3", (byte)62);
                  this.aClass526_Sub13_Sub1Array10146[0] = this.aClass284_10144.method3750("remapTex2D_1", 2147085899);
                  this.aClass526_Sub13_Sub1Array10146[1] = this.aClass284_10144.method3750("remapTex2D_2", 2121514838);
                  this.aClass526_Sub13_Sub1Array10146[2] = this.aClass284_10144.method3750("remapTex2D_3", 2142609598);
               }

               this.aClass526_Sub13_Sub1_10148 = this.aClass284_10144.method3750("paramsWeightings", 2137760559);
               this.aClass526_Sub13_Sub1_10149 = this.aClass284_10144.method3750("pixelOffset", 2105134729);
               this.aClass526_Sub13_Sub1_10150 = this.aClass284_10144.method3750("PosAndTexCoords", 2109163699);
            } catch (Exception_Sub5_Sub1 var2) {
               return false;
            } catch (Exception_Sub5_Sub2 var3) {
               return false;
            }

            if(this.aClass276Array10145[0].method3638() && this.aClass276Array10145[1].method3638() && this.aClass276Array10145[2].method3638()) {
               this.aBool10151 = true;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   boolean method4381() {
      return this.aClass174_Sub3_3524.aBool9827 && this.aClass174_Sub3_3524.method8719();
   }

   void method4386() {
   }

   void method4387() {
   }

   void method4394() {
   }

   int method4367() {
      return 0;
   }

   boolean method4368() {
      if(this.method4366()) {
         this.aClass284_10144 = this.aClass174_Sub3_3524.method8725("FilterColourRemapping");
         if(this.aClass284_10144 == null) {
            return false;
         } else {
            try {
               this.aClass526_Sub13_Sub1_10142 = this.aClass284_10144.method3750("sceneTex", 2108074458);
               this.aClass276Array10145 = new Class276[3];
               this.aClass526_Sub13_Sub1Array10146 = new Class526_Sub13_Sub1[3];
               if(this.aClass174_Sub3_3524.aBool9832) {
                  this.aClass276Array10145[0] = this.aClass284_10144.method3742("techRemap3D_1", (byte)119);
                  this.aClass276Array10145[1] = this.aClass284_10144.method3742("techRemap3D_2", (byte)19);
                  this.aClass276Array10145[2] = this.aClass284_10144.method3742("techRemap3D_3", (byte)42);
                  this.aClass526_Sub13_Sub1Array10146[0] = this.aClass284_10144.method3750("remapTex3D_1", 2121955851);
                  this.aClass526_Sub13_Sub1Array10146[1] = this.aClass284_10144.method3750("remapTex3D_2", 2115768250);
                  this.aClass526_Sub13_Sub1Array10146[2] = this.aClass284_10144.method3750("remapTex3D_3", 2119718319);
               } else {
                  this.aClass276Array10145[0] = this.aClass284_10144.method3742("techRemap2D_1", (byte)83);
                  this.aClass276Array10145[1] = this.aClass284_10144.method3742("techRemap2D_2", (byte)46);
                  this.aClass276Array10145[2] = this.aClass284_10144.method3742("techRemap2D_3", (byte)9);
                  this.aClass526_Sub13_Sub1Array10146[0] = this.aClass284_10144.method3750("remapTex2D_1", 2108438213);
                  this.aClass526_Sub13_Sub1Array10146[1] = this.aClass284_10144.method3750("remapTex2D_2", 2111431463);
                  this.aClass526_Sub13_Sub1Array10146[2] = this.aClass284_10144.method3750("remapTex2D_3", 2105904742);
               }

               this.aClass526_Sub13_Sub1_10148 = this.aClass284_10144.method3750("paramsWeightings", 2113871730);
               this.aClass526_Sub13_Sub1_10149 = this.aClass284_10144.method3750("pixelOffset", 2103491147);
               this.aClass526_Sub13_Sub1_10150 = this.aClass284_10144.method3750("PosAndTexCoords", 2141789573);
            } catch (Exception_Sub5_Sub1 var2) {
               return false;
            } catch (Exception_Sub5_Sub2 var3) {
               return false;
            }

            if(this.aClass276Array10145[0].method3638() && this.aClass276Array10145[1].method3638() && this.aClass276Array10145[2].method3638()) {
               this.aBool10151 = true;
               return true;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   int method4398() {
      return 1;
   }

   int method4392() {
      return 1;
   }

   boolean method4384() {
      return this.aBool10151;
   }

   int method4380() {
      return 0;
   }

   int method4404() {
      return 2;
   }

   boolean method4370() {
      return this.aBool10151;
   }

   void method4400(int var1, Class184_Sub2 var2, Interface38 var3, Interface23 var4, Interface38 var5, boolean var6) {
      float var7 = this.aClass174_Sub3_3524.method8737();
      float var8 = (float)var2.method2691();
      float var9 = (float)var2.method2693();
      float var11 = var7 * 2.0F / var8;
      float var12 = -var7 * 2.0F / var9;
      float[] var13 = new float[]{-1.0F + var11, 1.0F + var12, 0.0F, 0.0F, -1.0F + var11, -3.0F + var12, 0.0F, 2.0F, 3.0F + var11, 1.0F + var12, 2.0F, 0.0F};
      int var14 = (int)var8;
      int var15 = (int)var9;
      int var16 = var6?this.aClass174_Sub3_3524.method2248((byte)77).method2691():var14;
      int var17 = var6?this.aClass174_Sub3_3524.method2248((byte)12).method2693():var15;
      Class276 var18 = this.aClass276Array10145[anInt10140 - 1];
      this.aClass284_10144.method3757(var18);
      this.aClass284_10144.method3722();
      this.aClass284_10144.method3735(this.aClass526_Sub13_Sub1_10148, aFloat10141, aFloatArray10147[0], aFloatArray10147[1], aFloatArray10147[2], (byte)20);
      Interface41 var19 = null;
      Class526_Sub13_Sub1 var20 = null;

      for(int var21 = 0; var21 < anInt10140; ++var21) {
         if(aClass176_Sub1Array10143[var21] != null) {
            var20 = this.aClass526_Sub13_Sub1Array10146[var21];
            var19 = aClass176_Sub1Array10143[var21].method8408();
            this.aClass284_10144.method3760(var20, var21 + 1, var19, (byte)-15);
         }
      }

      float var25 = (float)var14 / var8;
      float var22 = (float)var15 / var9;
      float var23 = (float)var16 / var8;
      float var24 = (float)var17 / var9;
      var13[8] = (var13[8] + 1.0F) * var25 - 1.0F;
      var13[5] = (var13[5] - 1.0F) * var22 + 1.0F;
      var13[10] *= var23;
      var13[7] *= var24;
      this.aClass284_10144.method3730(this.aClass526_Sub13_Sub1_10150, var13, (short)-26097);
      this.aClass284_10144.method3760(this.aClass526_Sub13_Sub1_10142, 0, var3, (byte)-34);
      this.aClass284_10144.method3735(this.aClass526_Sub13_Sub1_10149, 0.0F, 0.0F, 0.0F, 0.0F, (byte)20);
      this.aClass174_Sub3_3524.method2573(0, 0, var14, var15);
   }

   void method4389(int var1, int var2) {
   }

   void method4401(int var1) {
      this.aClass284_10144.method3723();
   }

   void method4402(int var1) {
      this.aClass284_10144.method3723();
   }

   boolean method4379() {
      return anInt10140 == 0 || aFloat10141 == 1.0F || aFloatArray10147[0] + aFloatArray10147[1] + aFloatArray10147[2] == 0.0F || aClass176_Sub1Array10143[0] == null && aClass176_Sub1Array10143[1] == null && aClass176_Sub1Array10143[2] == null;
   }

   boolean method4399() {
      return this.aBool10151;
   }

   void method4403(int var1) {
      this.aClass284_10144.method3723();
   }
}
