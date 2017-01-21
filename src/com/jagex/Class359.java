package com.jagex;

import com.jagex.Class353;

public class Class359 {
   int anInt3822;
   long aLong3821;

   Class359(Class353[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.method4590(var1[var2]);
      }

   }

   public final int method4587() {
      return this.anInt3822;
   }

   public final Class353 method4588(int var1) {
      return Class353.method4565(this.method4589(var1));
   }

   final int method4589(int var1) {
      return (int)(this.aLong3821 >> Class353.anInt3669 * var1) & 15;
   }

   final void method4590(Class353 var1) {
      this.aLong3821 |= (long)(var1.anInt3684 << Class353.anInt3669 * this.anInt3822++);
   }

   Class359(Class353 var1) {
      this.aLong3821 = (long)var1.anInt3684;
      this.anInt3822 = 1;
   }

   public final int method4591() {
      return this.anInt3822;
   }
}
