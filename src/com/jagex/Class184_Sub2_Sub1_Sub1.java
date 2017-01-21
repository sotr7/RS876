package com.jagex;

import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class184_Sub2_Sub1;
import com.jagex.Interface21;
import com.jagex.Interface23;
import com.jagex.Interface58;
import jaggl.OpenGL;

public class Class184_Sub2_Sub1_Sub1 extends Class184_Sub2_Sub1 {
   static final int anInt12060 = 16;
   int anInt12055;
   int anInt12059;
   int anInt12058;
   int anInt12061;
   Interface58 anInterface58_12062;
   int anInt12056;
   Interface58[] anInterface58Array12063 = new Interface58[4];
   Class174_Sub3_Sub2 aClass174_Sub3_Sub2_12057;

   void method10888() {
      if(this.anInterface58_12062 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface58_12062.method51('\u8d00');
      }

   }

   public void method8468(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface58 var4 = (Interface58)var2;
      if(var2 == null) {
         this.anInt12055 &= ~var3;
         this.anInterface58Array12063[var1] = null;
         if(this.anInt12055 == 0) {
            this.anInt12059 = 0;
            this.anInt12058 = 0;
         }
      } else {
         if(this.anInt12055 != 0) {
            if(this.anInt12058 != var4.method1() || this.anInt12059 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12059 = var4.method94();
            this.anInt12058 = var4.method1();
            this.method10445();
         }

         this.anInt12055 |= var3;
         this.anInterface58Array12063[var1] = var4;
      }

      if(this == this.aClass174_Sub3_Sub2_12057.method2247((byte)6)) {
         this.method10893(var1);
      } else {
         this.anInt12061 |= var3;
      }

   }

   public int method2693() {
      return this.anInt12059;
   }

   public void method8465(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface58 var4 = (Interface58)var2;
      if(var2 == null) {
         this.anInt12055 &= ~var3;
         this.anInterface58Array12063[var1] = null;
         if(this.anInt12055 == 0) {
            this.anInt12059 = 0;
            this.anInt12058 = 0;
         }
      } else {
         if(this.anInt12055 != 0) {
            if(this.anInt12058 != var4.method1() || this.anInt12059 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12059 = var4.method94();
            this.anInt12058 = var4.method1();
            this.method10445();
         }

         this.anInt12055 |= var3;
         this.anInterface58Array12063[var1] = var4;
      }

      if(this == this.aClass174_Sub3_Sub2_12057.method2247((byte)6)) {
         this.method10893(var1);
      } else {
         this.anInt12061 |= var3;
      }

   }

   public void method8476(Interface23 var1) {
      Interface58 var2 = (Interface58)var1;
      if(var1 == null) {
         this.anInt12055 &= -17;
         this.anInterface58_12062 = null;
         if(this.anInt12055 == 0) {
            this.anInt12059 = 0;
            this.anInt12058 = 0;
         }
      } else {
         if(this.anInt12055 != 0) {
            if(this.anInt12058 != var2.method1() || this.anInt12059 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12059 = var2.method94();
            this.anInt12058 = var2.method1();
            this.method10445();
         }

         this.anInt12055 |= 16;
         this.anInterface58_12062 = var2;
      }

      if(this == this.aClass174_Sub3_Sub2_12057.method2247((byte)6)) {
         this.method10889();
      } else {
         this.anInt12061 |= 16;
      }

   }

   public int method2697() {
      return this.anInt12058;
   }

   void method10889() {
      if(this.anInterface58_12062 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface58_12062.method51('\u8d00');
      }

   }

   boolean method2705() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   boolean method363() {
      OpenGL.glBindFramebufferEXT('\u8d40', this.anInt12056);

      for(int var1 = 0; var1 < 4; ++var1) {
         if((this.anInt12061 & 1 << var1) != 0) {
            this.method10893(var1);
         }
      }

      if((this.anInt12061 & 16) != 0) {
         this.method10889();
      }

      this.anInt12061 = 0;
      return super.method363();
   }

   boolean method2694() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   public void method8470(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt12059;
         int var10 = this.aClass174_Sub3_Sub2_12057.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt12056);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method140() {
      if(this.anInt12056 != 0) {
         this.aClass174_Sub3_Sub2_12057.method10530(this.anInt12056);
         this.anInt12056 = 0;
      }

   }

   public void finalize() throws Throwable {
      super.finalize();
      this.method140();
   }

   public int method2701() {
      return this.anInt12059;
   }

   public int method2695() {
      return this.anInt12058;
   }

   public boolean method8467() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public int method2698() {
      return this.anInt12058;
   }

   public int method2699() {
      return this.anInt12058;
   }

   public int method2703() {
      return this.anInt12059;
   }

   public int method2691() {
      return this.anInt12058;
   }

   public int method2702() {
      return this.anInt12059;
   }

   public boolean method8466() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public void method8469(int var1, Interface21 var2) {
      int var3 = 1 << var1;
      Interface58 var4 = (Interface58)var2;
      if(var2 == null) {
         this.anInt12055 &= ~var3;
         this.anInterface58Array12063[var1] = null;
         if(this.anInt12055 == 0) {
            this.anInt12059 = 0;
            this.anInt12058 = 0;
         }
      } else {
         if(this.anInt12055 != 0) {
            if(this.anInt12058 != var4.method1() || this.anInt12059 != var4.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12059 = var4.method94();
            this.anInt12058 = var4.method1();
            this.method10445();
         }

         this.anInt12055 |= var3;
         this.anInterface58Array12063[var1] = var4;
      }

      if(this == this.aClass174_Sub3_Sub2_12057.method2247((byte)6)) {
         this.method10893(var1);
      } else {
         this.anInt12061 |= var3;
      }

   }

   void method10890(int var1) {
      Interface58 var2 = this.anInterface58Array12063[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   public void method8471(Interface23 var1) {
      Interface58 var2 = (Interface58)var1;
      if(var1 == null) {
         this.anInt12055 &= -17;
         this.anInterface58_12062 = null;
         if(this.anInt12055 == 0) {
            this.anInt12059 = 0;
            this.anInt12058 = 0;
         }
      } else {
         if(this.anInt12055 != 0) {
            if(this.anInt12058 != var2.method1() || this.anInt12059 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12059 = var2.method94();
            this.anInt12058 = var2.method1();
            this.method10445();
         }

         this.anInt12055 |= 16;
         this.anInterface58_12062 = var2;
      }

      if(this == this.aClass174_Sub3_Sub2_12057.method2247((byte)6)) {
         this.method10889();
      } else {
         this.anInt12061 |= 16;
      }

   }

   boolean method2692() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   public boolean method8473() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public void method8464(Interface23 var1) {
      Interface58 var2 = (Interface58)var1;
      if(var1 == null) {
         this.anInt12055 &= -17;
         this.anInterface58_12062 = null;
         if(this.anInt12055 == 0) {
            this.anInt12059 = 0;
            this.anInt12058 = 0;
         }
      } else {
         if(this.anInt12055 != 0) {
            if(this.anInt12058 != var2.method1() || this.anInt12059 != var2.method94()) {
               throw new RuntimeException();
            }
         } else {
            this.anInt12059 = var2.method94();
            this.anInt12058 = var2.method1();
            this.method10445();
         }

         this.anInt12055 |= 16;
         this.anInterface58_12062 = var2;
      }

      if(this == this.aClass174_Sub3_Sub2_12057.method2247((byte)6)) {
         this.method10889();
      } else {
         this.anInt12061 |= 16;
      }

   }

   boolean method364() {
      OpenGL.glBindFramebufferEXT('\u8d40', this.anInt12056);

      for(int var1 = 0; var1 < 4; ++var1) {
         if((this.anInt12061 & 1 << var1) != 0) {
            this.method10893(var1);
         }
      }

      if((this.anInt12061 & 16) != 0) {
         this.method10889();
      }

      this.anInt12061 = 0;
      return super.method363();
   }

   Class184_Sub2_Sub1_Sub1(Class174_Sub3_Sub2 var1) {
      super(var1);
      this.aClass174_Sub3_Sub2_12057 = var1;
      int[] var2 = new int[1];
      if(!this.aClass174_Sub3_Sub2_12057.aBool9827) {
         throw new RuntimeException("");
      } else {
         OpenGL.glGenFramebuffersEXT(1, var2, 0);
         this.anInt12056 = var2[0];
      }
   }

   boolean method2696() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   void method10891() throws Throwable {
      super.finalize();
      this.method140();
   }

   boolean method2706() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }

   public boolean method8472() {
      int var1 = OpenGL.glCheckFramebufferStatusEXT('\u8d40');
      return var1 == '\u8cd5';
   }

   public void method8475(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt12059;
         int var10 = this.aClass174_Sub3_Sub2_12057.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt12056);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method8474(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt12059;
         int var10 = this.aClass174_Sub3_Sub2_12057.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt12056);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method8477(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
      if(var7 | var8) {
         int var9 = this.anInt12059;
         int var10 = this.aClass174_Sub3_Sub2_12057.method2247((byte)6).method2693();
         int var11 = 0;
         if(var8) {
            var11 |= 256;
         }

         if(var7) {
            var11 |= 16384;
         }

         OpenGL.glBindFramebufferEXT('\u8ca8', this.anInt12056);
         OpenGL.glBlitFramebufferEXT(var1, var9 - var2 - var4, var1 + var3, var9 - var2, var5, var10 - var6 - var4, var5 + var3, var10 - var6, var11, 9728);
         OpenGL.glBindFramebufferEXT('\u8ca8', 0);
      }

   }

   public void method208() {
      if(this.anInt12056 != 0) {
         this.aClass174_Sub3_Sub2_12057.method10530(this.anInt12056);
         this.anInt12056 = 0;
      }

   }

   void method10892() throws Throwable {
      super.finalize();
      this.method140();
   }

   public int method2700() {
      return this.anInt12058;
   }

   void method10893(int var1) {
      Interface58 var2 = this.anInterface58Array12063[var1];
      if(var2 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8ce0' + var1, '\u8d41', 0);
      } else {
         var2.method51('\u8ce0' + var1);
      }

   }

   void method10894() {
      if(this.anInterface58_12062 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface58_12062.method51('\u8d00');
      }

   }

   void method10895() {
      if(this.anInterface58_12062 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface58_12062.method51('\u8d00');
      }

   }

   void method10896() {
      if(this.anInterface58_12062 == null) {
         OpenGL.glFramebufferRenderbufferEXT('\u8d40', '\u8d00', '\u8d41', 0);
      } else {
         this.anInterface58_12062.method51('\u8d00');
      }

   }

   boolean method2704() {
      OpenGL.glBindFramebufferEXT('\u8d40', 0);
      return true;
   }
}
