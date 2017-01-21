package com.jagex;

import com.jagex.Class153;
import com.jagex.Class162;
import com.jagex.Class162_Sub2;
import com.jagex.Class174_Sub1;

public abstract class Class153_Sub1 extends Class153 {
   static final int anInt8938 = 8;
   static final int anInt8939 = 12;
   static final int anInt8940 = 4;
   int anInt8941;
   int anInt8958;
   int anInt8934;
   int anInt8935;
   int[] anIntArray8961;
   static int anInt8929;
   static int anInt8945;
   static int anInt8933;
   static int anInt8947;
   static int anInt8948;
   static int anInt8949;
   static int anInt8950;
   static int anInt8951;
   static int anInt8952;
   static int anInt8953;
   static int anInt8954;
   static int anInt8955;
   static int anInt8962;
   static int anInt8946;
   static int anInt8942;
   static int anInt8943;
   static int anInt8956;
   static int anInt8957 = 0;
   static int anInt8930 = 0;
   static int anInt8959 = 0;
   static int anInt8960 = 0;
   static int anInt8964 = 0;
   static int anInt8937 = 0;
   static int anInt8963 = 0;
   static int anInt8931 = 0;
   Class174_Sub1 aClass174_Sub1_8932;
   int anInt8936;
   int anInt8944;

   abstract void method8375(int var1, int var2);

   public void method1828(int var1, int var2, int var3, int var4) {
      this.anInt8941 = var1;
      this.anInt8958 = var2;
      this.anInt8934 = var3;
      this.anInt8935 = var4;
   }

   public void method1803(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         if(this.anIntArray8961 == null) {
            this.anIntArray8961 = new int[4];
         }

         this.aClass174_Sub1_8932.method2282(this.anIntArray8961);
         this.aClass174_Sub1_8932.method2317(this.aClass174_Sub1_8932.anInt9247 * -217416947, this.aClass174_Sub1_8932.anInt9267 * 1511023883, var1 + var3, var2 + var4);
         int var8 = this.method21();
         int var9 = this.method1788();
         int var10 = (var3 + var8 - 1) / var8;
         int var11 = (var4 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var12 * var9;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1774(var1 + var14 * var8, var2 + var13, var5, var6, var7);
            }
         }

         this.aClass174_Sub1_8932.method2538(this.anIntArray8961[0], this.anIntArray8961[1], this.anIntArray8961[2], this.anIntArray8961[3]);
      }
   }

   public int method1825() {
      return this.anInt8936;
   }

   public int method1771() {
      return this.anInt8944;
   }

   public int method1823() {
      return this.anInt8944;
   }

   public int method1788() {
      return this.anInt8958 + this.anInt8944 + this.anInt8935;
   }

   public abstract void method1770(int var1, int var2, int var3, int var4, int var5);

   public int method21() {
      return this.anInt8941 + this.anInt8936 + this.anInt8934;
   }

   public abstract void method1779(int var1, int var2, Class162 var3, int var4, int var5);

   abstract void method8376(int[] var1, int[] var2, int var3, int var4);

   abstract void method8377(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13);

   public void method1784(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         if(this.anIntArray8961 == null) {
            this.anIntArray8961 = new int[4];
         }

         this.aClass174_Sub1_8932.method2282(this.anIntArray8961);
         this.aClass174_Sub1_8932.method2317(this.aClass174_Sub1_8932.anInt9247 * -217416947, this.aClass174_Sub1_8932.anInt9267 * 1511023883, var1 + var3, var2 + var4);
         int var8 = this.method21();
         int var9 = this.method1788();
         int var10 = (var3 + var8 - 1) / var8;
         int var11 = (var4 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var12 * var9;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1774(var1 + var14 * var8, var2 + var13, var5, var6, var7);
            }
         }

         this.aClass174_Sub1_8932.method2538(this.anIntArray8961[0], this.anIntArray8961[1], this.anIntArray8961[2], this.anIntArray8961[3]);
      }
   }

   boolean method8378(float var1, float var2, float var3, float var4, float var5, float var6) {
      int var7 = this.anInt8941 + this.anInt8936 + this.anInt8934;
      int var8 = this.anInt8958 + this.anInt8944 + this.anInt8935;
      float var9;
      float var10;
      float var11;
      float var12;
      float var13;
      float var14;
      float var15;
      float var16;
      if(var7 != this.anInt8936 || var8 != this.anInt8944) {
         var9 = (var3 - var1) / (float)var7;
         var10 = (var4 - var2) / (float)var7;
         var11 = (var5 - var1) / (float)var8;
         var12 = (var6 - var2) / (float)var8;
         var13 = var11 * (float)this.anInt8958;
         var14 = var12 * (float)this.anInt8958;
         var15 = var9 * (float)this.anInt8941;
         var16 = var10 * (float)this.anInt8941;
         float var17 = -var9 * (float)this.anInt8934;
         float var18 = -var10 * (float)this.anInt8934;
         float var19 = -var11 * (float)this.anInt8935;
         float var20 = -var12 * (float)this.anInt8935;
         var1 += var15 + var13;
         var2 += var16 + var14;
         var3 += var17 + var13;
         var4 += var18 + var14;
         var5 += var15 + var19;
         var6 += var16 + var20;
      }

      var9 = var5 + (var3 - var1);
      var10 = var4 + (var6 - var2);
      if(var1 < var3) {
         var11 = var1;
         var12 = var3;
      } else {
         var11 = var3;
         var12 = var1;
      }

      if(var5 < var11) {
         var11 = var5;
      }

      if(var9 < var11) {
         var11 = var9;
      }

      if(var5 > var12) {
         var12 = var5;
      }

      if(var9 > var12) {
         var12 = var9;
      }

      if(var2 < var4) {
         var13 = var2;
         var14 = var4;
      } else {
         var13 = var4;
         var14 = var2;
      }

      if(var6 < var13) {
         var13 = var6;
      }

      if(var10 < var13) {
         var13 = var10;
      }

      if(var6 > var14) {
         var14 = var6;
      }

      if(var10 > var14) {
         var14 = var10;
      }

      if(var11 < (float)(this.aClass174_Sub1_8932.anInt9247 * -217416947)) {
         var11 = (float)(this.aClass174_Sub1_8932.anInt9247 * -217416947);
      }

      if(var12 > (float)(this.aClass174_Sub1_8932.anInt9271 * 1270312011)) {
         var12 = (float)(this.aClass174_Sub1_8932.anInt9271 * 1270312011);
      }

      if(var13 < (float)(this.aClass174_Sub1_8932.anInt9267 * 1511023883)) {
         var13 = (float)(this.aClass174_Sub1_8932.anInt9267 * 1511023883);
      }

      if(var14 > (float)(this.aClass174_Sub1_8932.anInt9250 * -288042733)) {
         var14 = (float)(this.aClass174_Sub1_8932.anInt9250 * -288042733);
      }

      var12 = var11 - var12;
      if(var12 >= 0.0F) {
         return false;
      } else {
         var14 = var13 - var14;
         if(var14 >= 0.0F) {
            return false;
         } else {
            anInt8929 = this.aClass174_Sub1_8932.anInt9277 * -2145294317;
            anInt8945 = (int)((float)((int)var13 * anInt8929) + var11);
            var15 = (var3 - var1) * (var6 - var2) - (var4 - var2) * (var5 - var1);
            var16 = (var5 - var1) * (var4 - var2) - (var6 - var2) * (var3 - var1);
            anInt8933 = (int)((var6 - var2) * 4096.0F * (float)this.anInt8936 / var15);
            anInt8947 = (int)((var4 - var2) * 4096.0F * (float)this.anInt8944 / var16);
            anInt8948 = (int)((var5 - var1) * 4096.0F * (float)this.anInt8936 / var16);
            anInt8949 = (int)((var3 - var1) * 4096.0F * (float)this.anInt8944 / var15);
            anInt8950 = (int)(var11 * 16.0F + 8.0F - (var1 + var3 + var5 + var9) / 4.0F * 16.0F);
            anInt8951 = (int)(var13 * 16.0F + 8.0F - (var2 + var4 + var6 + var10) / 4.0F * 16.0F);
            anInt8952 = (this.anInt8936 >> 1 << 12) + (anInt8951 * anInt8948 >> 4);
            anInt8953 = (this.anInt8944 >> 1 << 12) + (anInt8951 * anInt8949 >> 4);
            anInt8954 = anInt8950 * anInt8933 >> 4;
            anInt8955 = anInt8950 * anInt8947 >> 4;
            anInt8962 = (int)var11;
            anInt8946 = (int)var12;
            anInt8942 = (int)var13;
            anInt8943 = (int)var14;
            return true;
         }
      }
   }

   void method1791(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(this.method8378(var1, var2, var3, var4, var5, var6)) {
         anInt8956 = var8;
         if(var7 != 1) {
            anInt8957 = var8 >>> 24;
            anInt8930 = 256 - anInt8957;
            if(var7 == 0) {
               anInt8959 = (var8 & 16711680) >> 16;
               anInt8960 = (var8 & '\uff00') >> 8;
               anInt8964 = var8 & 255;
            } else if(var7 == 2) {
               anInt8937 = var8 >>> 24;
               anInt8963 = 256 - anInt8937;
               int var11 = (var8 & 16711935) * anInt8963 & -16711936;
               int var12 = (var8 & '\uff00') * anInt8963 & 16711680;
               anInt8931 = (var11 | var12) >>> 8;
            }
         }

         this.method8379(var7, var9);
      }
   }

   abstract void method8379(int var1, int var2);

   void method1793(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(this.method8378(var1, var2, var3, var4, var5, var6)) {
         Class162_Sub2 var11 = (Class162_Sub2)var8;
         this.method8386(var11.anIntArray9211, var11.anIntArray9210, anInt8962 - var9, -var10 - (anInt8943 - anInt8942));
      }
   }

   Class153_Sub1(Class174_Sub1 var1, int var2, int var3) {
      this.aClass174_Sub1_8932 = var1;
      this.anInt8936 = var2;
      this.anInt8944 = var3;
   }

   public abstract void method1794(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public abstract void method1795(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public abstract void method1796(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   void method1814(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(this.method8378(var1, var2, var3, var4, var5, var6)) {
         anInt8956 = var8;
         if(var7 != 1) {
            anInt8957 = var8 >>> 24;
            anInt8930 = 256 - anInt8957;
            if(var7 == 0) {
               anInt8959 = (var8 & 16711680) >> 16;
               anInt8960 = (var8 & '\uff00') >> 8;
               anInt8964 = var8 & 255;
            } else if(var7 == 2) {
               anInt8937 = var8 >>> 24;
               anInt8963 = 256 - anInt8937;
               int var11 = (var8 & 16711935) * anInt8963 & -16711936;
               int var12 = (var8 & '\uff00') * anInt8963 & 16711680;
               anInt8931 = (var11 | var12) >>> 8;
            }
         }

         this.method8379(var7, var9);
      }
   }

   abstract void method8380(int[] var1, int[] var2, int var3, int var4);

   public abstract void method1804(int var1, int var2, int var3, int var4, int var5);

   abstract void method8381(int var1, int var2);

   abstract void method1819(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   abstract void method1807(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   abstract void method1808(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   abstract void method8382(boolean var1, boolean var2, boolean var3, int var4, int var5, float var6, int var7, int var8, int var9, int var10, int var11, int var12, boolean var13);

   public int method1787() {
      return this.anInt8944;
   }

   abstract void method1775(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

   public abstract void method1802(int var1, int var2, int var3, int var4, int var5);

   abstract void method8383(int[] var1, int[] var2, int var3, int var4);

   abstract void method8384(int[] var1, int[] var2, int var3, int var4);

   public int method1813() {
      return this.anInt8936;
   }

   abstract void method8385(int[] var1, int[] var2, int var3, int var4);

   public abstract void method1805(int var1, int var2, Class162 var3, int var4, int var5);

   public void method1809(int var1, int var2, int var3, int var4) {
      this.anInt8941 = var1;
      this.anInt8958 = var2;
      this.anInt8934 = var3;
      this.anInt8935 = var4;
   }

   public void method1810(int[] var1) {
      var1[0] = this.anInt8941;
      var1[1] = this.anInt8958;
      var1[2] = this.anInt8934;
      var1[3] = this.anInt8935;
   }

   public void method1811(int[] var1) {
      var1[0] = this.anInt8941;
      var1[1] = this.anInt8958;
      var1[2] = this.anInt8934;
      var1[3] = this.anInt8935;
   }

   public int method1812() {
      return this.anInt8936;
   }

   public int method20() {
      return this.anInt8941 + this.anInt8936 + this.anInt8934;
   }

   public abstract void method1782(int var1, int var2, int var3, int var4, int[] var5, int var6, int var7);

   public void method1769(int[] var1) {
      var1[0] = this.anInt8941;
      var1[1] = this.anInt8958;
      var1[2] = this.anInt8934;
      var1[3] = this.anInt8935;
   }

   public int method1827() {
      return this.anInt8944;
   }

   public int method18() {
      return this.anInt8941 + this.anInt8936 + this.anInt8934;
   }

   public abstract void method1774(int var1, int var2, int var3, int var4, int var5);

   public int method19() {
      return this.anInt8941 + this.anInt8936 + this.anInt8934;
   }

   public int method1818() {
      return this.anInt8958 + this.anInt8944 + this.anInt8935;
   }

   public int method1817() {
      return this.anInt8958 + this.anInt8944 + this.anInt8935;
   }

   public void method1806(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         if(this.anIntArray8961 == null) {
            this.anIntArray8961 = new int[4];
         }

         this.aClass174_Sub1_8932.method2282(this.anIntArray8961);
         this.aClass174_Sub1_8932.method2317(this.aClass174_Sub1_8932.anInt9247 * -217416947, this.aClass174_Sub1_8932.anInt9267 * 1511023883, var1 + var3, var2 + var4);
         int var8 = this.method21();
         int var9 = this.method1788();
         int var10 = (var3 + var8 - 1) / var8;
         int var11 = (var4 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var12 * var9;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1774(var1 + var14 * var8, var2 + var13, var5, var6, var7);
            }
         }

         this.aClass174_Sub1_8932.method2538(this.anIntArray8961[0], this.anIntArray8961[1], this.anIntArray8961[2], this.anIntArray8961[3]);
      }
   }

   public void method1780(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else {
         if(this.anIntArray8961 == null) {
            this.anIntArray8961 = new int[4];
         }

         this.aClass174_Sub1_8932.method2282(this.anIntArray8961);
         this.aClass174_Sub1_8932.method2317(this.aClass174_Sub1_8932.anInt9247 * -217416947, this.aClass174_Sub1_8932.anInt9267 * 1511023883, var1 + var3, var2 + var4);
         int var8 = this.method21();
         int var9 = this.method1788();
         int var10 = (var3 + var8 - 1) / var8;
         int var11 = (var4 + var9 - 1) / var9;

         for(int var12 = 0; var12 < var11; ++var12) {
            int var13 = var12 * var9;

            for(int var14 = 0; var14 < var10; ++var14) {
               this.method1774(var1 + var14 * var8, var2 + var13, var5, var6, var7);
            }
         }

         this.aClass174_Sub1_8932.method2538(this.anIntArray8961[0], this.anIntArray8961[1], this.anIntArray8961[2], this.anIntArray8961[3]);
      }
   }

   abstract void method8386(int[] var1, int[] var2, int var3, int var4);

   abstract void method8387(int var1, int var2);

   void method1820(float var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(this.method8378(var1, var2, var3, var4, var5, var6)) {
         anInt8956 = var8;
         if(var7 != 1) {
            anInt8957 = var8 >>> 24;
            anInt8930 = 256 - anInt8957;
            if(var7 == 0) {
               anInt8959 = (var8 & 16711680) >> 16;
               anInt8960 = (var8 & '\uff00') >> 8;
               anInt8964 = var8 & 255;
            } else if(var7 == 2) {
               anInt8937 = var8 >>> 24;
               anInt8963 = 256 - anInt8937;
               int var11 = (var8 & 16711935) * anInt8963 & -16711936;
               int var12 = (var8 & '\uff00') * anInt8963 & 16711680;
               anInt8931 = (var11 | var12) >>> 8;
            }
         }

         this.method8379(var7, var9);
      }
   }

   void method1821(float var1, float var2, float var3, float var4, float var5, float var6, int var7, Class162 var8, int var9, int var10) {
      if(this.aClass174_Sub1_8932.method8494()) {
         throw new IllegalStateException();
      } else if(this.method8378(var1, var2, var3, var4, var5, var6)) {
         Class162_Sub2 var11 = (Class162_Sub2)var8;
         this.method8386(var11.anIntArray9211, var11.anIntArray9210, anInt8962 - var9, -var10 - (anInt8943 - anInt8942));
      }
   }
}
