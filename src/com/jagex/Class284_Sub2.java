package com.jagex;

import com.jagex.Class174_Sub3;
import com.jagex.Class174_Sub3_Sub2;
import com.jagex.Class266;
import com.jagex.Class274;
import com.jagex.Class276;
import com.jagex.Class276_Sub2;
import com.jagex.Class281;
import com.jagex.Class284;
import com.jagex.Class526_Sub13_Sub1;
import com.jagex.Class526_Sub13_Sub1_Sub2;
import com.jagex.RuntimeException_Sub4;
import jaggl.OpenGL;

public class Class284_Sub2 extends Class284 {
   Class276_Sub2 aClass276_Sub2_10029;
   int anInt10031;
   Class174_Sub3_Sub2 aClass174_Sub3_Sub2_10030;

   Class526_Sub13_Sub1 method3765(Class281 var1) {
      return new Class526_Sub13_Sub1_Sub2(this, var1);
   }

   Class276 method3764(Class174_Sub3 var1, Class266 var2) {
      return new Class276_Sub2((Class174_Sub3_Sub2)var1, this, var2);
   }

   public boolean method3757(Class276 var1) {
      if(this.aClass276_Sub2_10029 == var1) {
         return true;
      } else if(!var1.method3638()) {
         return false;
      } else {
         boolean var2 = this.method3724();
         this.aClass276_Sub2_10029 = (Class276_Sub2)var1;
         this.anInt3071 = this.method3774(var1, -1091708367) * 568998807;
         if(this.anInt3071 * 1682175015 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.anInt10031 = this.aClass276_Sub2_10029.anInt10084;
            if(var2) {
               OpenGL.glUseProgram(this.anInt10031);
               this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 = this.aClass276_Sub2_10029;
            }

            return true;
         }
      }
   }

   Class526_Sub13_Sub1 method3726(Class281 var1) {
      return new Class526_Sub13_Sub1_Sub2(this, var1);
   }

   public boolean method3724() {
      return this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 == this.aClass276_Sub2_10029;
   }

   public boolean method3762(Class276 var1) {
      if(this.aClass276_Sub2_10029 == var1) {
         return true;
      } else if(!var1.method3638()) {
         return false;
      } else {
         boolean var2 = this.method3724();
         this.aClass276_Sub2_10029 = (Class276_Sub2)var1;
         this.anInt3071 = this.method3774(var1, -126892930) * 568998807;
         if(this.anInt3071 * 1682175015 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.anInt10031 = this.aClass276_Sub2_10029.anInt10084;
            if(var2) {
               OpenGL.glUseProgram(this.anInt10031);
               this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 = this.aClass276_Sub2_10029;
            }

            return true;
         }
      }
   }

   Class284_Sub2(Class174_Sub3_Sub2 var1, Class274 var2) {
      super(var1, var2);
      this.aClass174_Sub3_Sub2_10030 = var1;
   }

   public boolean method3763(Class276 var1) {
      if(this.aClass276_Sub2_10029 == var1) {
         return true;
      } else if(!var1.method3638()) {
         return false;
      } else {
         boolean var2 = this.method3724();
         this.aClass276_Sub2_10029 = (Class276_Sub2)var1;
         this.anInt3071 = this.method3774(var1, -54371377) * 568998807;
         if(this.anInt3071 * 1682175015 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.anInt10031 = this.aClass276_Sub2_10029.anInt10084;
            if(var2) {
               OpenGL.glUseProgram(this.anInt10031);
               this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 = this.aClass276_Sub2_10029;
            }

            return true;
         }
      }
   }

   public void finalize() throws Throwable {
      this.method3758();
      super.finalize();
   }

   void method9072() throws Throwable {
      this.method3758();
      super.finalize();
   }

   public boolean method3754() {
      return this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 == this.aClass276_Sub2_10029;
   }

   public void method3771() {
      if(this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 != this.aClass276_Sub2_10029) {
         if(this.aClass276_Sub2_10029 == null) {
            throw new RuntimeException_Sub4();
         } else {
            OpenGL.glUseProgram(this.anInt10031);
            this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 = this.aClass276_Sub2_10029;
         }
      }
   }

   public void method3766() {
   }

   public void method3773() {
   }

   public void method3738() {
   }

   void method9073() throws Throwable {
      this.method3758();
      super.finalize();
   }

   public boolean method3728() {
      return this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 == this.aClass276_Sub2_10029;
   }

   void method3778() {
      for(int var1 = 0; var1 < this.method3727(1214310322); ++var1) {
         ((Class276_Sub2)this.method3755(var1, -2039546744)).method140();
      }

      super.method3758();
   }

   void method3758() {
      for(int var1 = 0; var1 < this.method3727(619378491); ++var1) {
         ((Class276_Sub2)this.method3755(var1, -1621198260)).method140();
      }

      super.method3758();
   }

   public boolean method3729(Class276 var1) {
      if(this.aClass276_Sub2_10029 == var1) {
         return true;
      } else if(!var1.method3638()) {
         return false;
      } else {
         boolean var2 = this.method3724();
         this.aClass276_Sub2_10029 = (Class276_Sub2)var1;
         this.anInt3071 = this.method3774(var1, -1942657029) * 568998807;
         if(this.anInt3071 * 1682175015 == -1) {
            throw new IllegalArgumentException();
         } else {
            this.anInt10031 = this.aClass276_Sub2_10029.anInt10084;
            if(var2) {
               OpenGL.glUseProgram(this.anInt10031);
               this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 = this.aClass276_Sub2_10029;
            }

            return true;
         }
      }
   }

   public void method3722() {
      if(this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 != this.aClass276_Sub2_10029) {
         if(this.aClass276_Sub2_10029 == null) {
            throw new RuntimeException_Sub4();
         } else {
            OpenGL.glUseProgram(this.anInt10031);
            this.aClass174_Sub3_Sub2_10030.aClass276_Sub2_11512 = this.aClass276_Sub2_10029;
         }
      }
   }

   public void method3723() {
   }

   Class276 method3775(Class174_Sub3 var1, Class266 var2) {
      return new Class276_Sub2((Class174_Sub3_Sub2)var1, this, var2);
   }

   Class276 method3779(Class174_Sub3 var1, Class266 var2) {
      return new Class276_Sub2((Class174_Sub3_Sub2)var1, this, var2);
   }
}
