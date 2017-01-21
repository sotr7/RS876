package com.jagex;

import com.jagex.Class174_Sub2;
import com.jagex.Class184_Sub2;
import com.jagex.Interface16;
import com.jagex.Interface21;
import com.jagex.Interface23;
import jaggl.OpenGL;

public class Class184_Sub2_Sub2 extends Class184_Sub2 {
   static final int anInt11367 = 16;
   int anInt11372;
   int anInt11370;
   int anInt11368;
   int anInt11371;
   Interface16 anInterface16_11365;
   int anInt11369;
   Interface16[] anInterface16Array11373 = new Interface16[4];
   Class174_Sub2 aClass174_Sub2_11366;

   void method10450() throws Throwable {
      super.finalize();
      this.method140();
   }

   public int method2691() {
      return this.anInt11368;
   }

   void method10451(int var1) {
      Interface16 var2 = this.anInterface16Array11373[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   public void method8465(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface16 var4 = (Interface16)var2;
      if(var2 == null) {
         this.anInt11372 &= ~var3;
         this.anInterface16Array11373[var1] = null;
         if(this.anInt11372 == 0) {
            this.anInt11370 = 0;
            this.anInt11368 = 0;
         }
      } else {
         if((this.anInt11372 | var3) != var3) {
            if(this.anInt11368 != var4.method1() || this.anInt11370 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt11370 = var4.method94();
            this.anInt11368 = var4.method1();
            if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
               this.aClass174_Sub2_11366.method8602();
            }
         }

         this.anInt11372 |= var3;
         this.anInterface16Array11373[var1] = var4;
      }

      if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
         this.method10460(var1);
      } else {
         this.anInt11371 |= var3;
      }

   }

   public void method8476(Interface23 var1) {
      Interface16 var2 = (Interface16)var1;
      if(var1 == null) {
         this.anInt11372 &= -17;
         this.anInterface16_11365 = null;
         if(this.anInt11372 == 0) {
            this.anInt11370 = 0;
            this.anInt11368 = 0;
         }
      } else {
         if((this.anInt11372 | 16) != 16) {
            if(this.anInt11368 != var2.method1() || this.anInt11370 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt11370 = var2.method94();
            this.anInt11368 = var2.method1();
            if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
               this.aClass174_Sub2_11366.method8602();
            }
         }

         this.anInt11372 |= 16;
         this.anInterface16_11365 = var2;
      }

      if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
         this.method10452();
      } else {
         this.anInt11371 |= 16;
      }

   }

   public int method2699() {
      return this.anInt11368;
   }

   void method10452() {
      if(this.anInterface16_11365 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface16_11365.method51('\u8d00');
      }

   }

   void method10453(int var1) {
      Interface16 var2 = this.anInterface16Array11373[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   boolean method363() {
      OpenGL.glBindFramebufferEXT('\u8d40', this.anInt11369);

      for(int var1 = 0; var1 < 4; ++var1) {
         if((this.anInt11371 & 1 << var1) != 0) {
            this.method10460(var1);
         }
      }

      if((this.anInt11371 & 16) != 0) {
         this.method10452();
      }

      this.anInt11371 = 0;
      this.aClass174_Sub2_11366.method8635();
      return true;
   }

   boolean method2694() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   void method10454(int var1) {
      OpenGL.glDrawBuffer('\u8ce0' + var1);
   }

   public void method8470(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt11370;
         int var10 = this.aClass174_Sub2_11366.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt11369);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method140() {
      if(this.anInt11369 != 0) {
         this.aClass174_Sub2_11366.method8658(this.anInt11369);
         this.anInt11369 = 0;
      }

   }

   public boolean method8466() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public int method2700() {
      return this.anInt11368;
   }

   public int method2695() {
      return this.anInt11368;
   }

   Class184_Sub2_Sub2(Class174_Sub2 var1) {
      if(!var1.aBool9638) {
         throw new IllegalStateException("");
      } else {
         this.aClass174_Sub2_11366 = var1;
         int[] var2 = new int[1];
         OpenGL.glGenFramebuffersEXT(1, var2, 0);
         this.anInt11369 = var2[0];
      }
   }

   public int method2698() {
      return this.anInt11368;
   }

   void method10455() {
      if(this.anInterface16_11365 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface16_11365.method51('\u8d00');
      }

   }

   public int method2703() {
      return this.anInt11370;
   }

   public int method2701() {
      return this.anInt11370;
   }

   public int method2702() {
      return this.anInt11370;
   }

   public void method8468(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface16 var4 = (Interface16)var2;
      if(var2 == null) {
         this.anInt11372 &= ~var3;
         this.anInterface16Array11373[var1] = null;
         if(this.anInt11372 == 0) {
            this.anInt11370 = 0;
            this.anInt11368 = 0;
         }
      } else {
         if((this.anInt11372 | var3) != var3) {
            if(this.anInt11368 != var4.method1() || this.anInt11370 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt11370 = var4.method94();
            this.anInt11368 = var4.method1();
            if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
               this.aClass174_Sub2_11366.method8602();
            }
         }

         this.anInt11372 |= var3;
         this.anInterface16Array11373[var1] = var4;
      }

      if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
         this.method10460(var1);
      } else {
         this.anInt11371 |= var3;
      }

   }

   void method10456(int var1) {
      OpenGL.glDrawBuffer('\u8ce0' + var1);
   }

   boolean method364() {
      OpenGL.glBindFramebufferEXT('\u8d40', this.anInt11369);

      for(int var1 = 0; var1 < 4; ++var1) {
         if((this.anInt11371 & 1 << var1) != 0) {
            this.method10460(var1);
         }
      }

      if((this.anInt11371 & 16) != 0) {
         this.method10452();
      }

      this.anInt11371 = 0;
      this.aClass174_Sub2_11366.method8635();
      return true;
   }

   public void method8471(Interface23 var1) {
      Interface16 var2 = (Interface16)var1;
      if(var1 == null) {
         this.anInt11372 &= -17;
         this.anInterface16_11365 = null;
         if(this.anInt11372 == 0) {
            this.anInt11370 = 0;
            this.anInt11368 = 0;
         }
      } else {
         if((this.anInt11372 | 16) != 16) {
            if(this.anInt11368 != var2.method1() || this.anInt11370 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt11370 = var2.method94();
            this.anInt11368 = var2.method1();
            if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
               this.aClass174_Sub2_11366.method8602();
            }
         }

         this.anInt11372 |= 16;
         this.anInterface16_11365 = var2;
      }

      if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
         this.method10452();
      } else {
         this.anInt11371 |= 16;
      }

   }

   public void finalize() throws Throwable {
      super.finalize();
      this.method140();
   }

   public boolean method8473() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public boolean method8467() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public void method8464(Interface23 var1) {
      Interface16 var2 = (Interface16)var1;
      if(var1 == null) {
         this.anInt11372 &= -17;
         this.anInterface16_11365 = null;
         if(this.anInt11372 == 0) {
            this.anInt11370 = 0;
            this.anInt11368 = 0;
         }
      } else {
         if((this.anInt11372 | 16) != 16) {
            if(this.anInt11368 != var2.method1() || this.anInt11370 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt11370 = var2.method94();
            this.anInt11368 = var2.method1();
            if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
               this.aClass174_Sub2_11366.method8602();
            }
         }

         this.anInt11372 |= 16;
         this.anInterface16_11365 = var2;
      }

      if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
         this.method10452();
      } else {
         this.anInt11371 |= 16;
      }

   }

   public void method8477(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt11370;
         int var10 = this.aClass174_Sub2_11366.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt11369);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   boolean method2696() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   boolean method2704() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   boolean method2706() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   public int method2693() {
      return this.anInt11370;
   }

   public void method8475(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt11370;
         int var10 = this.aClass174_Sub2_11366.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt11369);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method8474(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt11370;
         int var10 = this.aClass174_Sub2_11366.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt11369);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   void method10457(int var1) {
      Interface16 var2 = this.anInterface16Array11373[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   public void method208() {
      if(this.anInt11369 != 0) {
         this.aClass174_Sub2_11366.method8658(this.anInt11369);
         this.anInt11369 = 0;
      }

   }

   public void method8469(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface16 var4 = (Interface16)var2;
      if(var2 == null) {
         this.anInt11372 &= ~var3;
         this.anInterface16Array11373[var1] = null;
         if(this.anInt11372 == 0) {
            this.anInt11370 = 0;
            this.anInt11368 = 0;
         }
      } else {
         if((this.anInt11372 | var3) != var3) {
            if(this.anInt11368 != var4.method1() || this.anInt11370 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt11370 = var4.method94();
            this.anInt11368 = var4.method1();
            if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
               this.aClass174_Sub2_11366.method8602();
            }
         }

         this.anInt11372 |= var3;
         this.anInterface16Array11373[var1] = var4;
      }

      if(this == this.aClass174_Sub2_11366.method2247((byte)6)) {
         this.method10460(var1);
      } else {
         this.anInt11371 |= var3;
      }

   }

   void method10458() throws Throwable {
      super.finalize();
      this.method140();
   }

   void method10459(int var1) {
      Interface16 var2 = this.anInterface16Array11373[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   boolean method2705() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   void method10460(int var1) {
      Interface16 var2 = this.anInterface16Array11373[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   void method10461(int var1) {
      Interface16 var2 = this.anInterface16Array11373[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   public boolean method8472() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   void method10462() {
      if(this.anInterface16_11365 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface16_11365.method51('\u8d00');
      }

   }

   boolean method2692() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   void method10463() {
      if(this.anInterface16_11365 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface16_11365.method51('\u8d00');
      }

   }

   void method10464(int var1) {
      OpenGL.glDrawBuffer('\u8ce0' + var1);
   }

   public int method2697() {
      return this.anInt11368;
   }
}
