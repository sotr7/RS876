package com.jagex;

import com.jagex.Class260;
import com.jagex.Class265;
import com.jagex.Class281;
import com.jagex.Class526_Sub13;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.IllegalArgumentException_Sub1;

public abstract class Class526_Sub13_Sub1 extends Class526_Sub13 {
   Class260 aClass260_11713;
   String aString11711;
   String aString11710;
   int anInt11714;
   Class260 aClass260_11712;

   public abstract int method10625(int var1);

   public abstract boolean method10626(int var1);

   String method10627(int var1) {
      return this.aString11711;
   }

   Class526_Sub13_Sub1(Class281 var1) {
      this.aClass260_11713 = var1.aClass260_3045;
      this.aString11711 = var1.aString3041;
      this.aString11710 = var1.aString3044;
      this.anInt11714 = -33101799 * var1.anInt3042;
      this.aClass260_11712 = var1.aClass260_3043;
   }

   public int method10628(byte var1) {
      if(Class260.aClass260_2839 != this.aClass260_11713) {
         throw new IllegalArgumentException_Sub1(this, this.aClass260_11713.toString().toLowerCase());
      } else {
         return this.anInt11714 * -520348339;
      }
   }

   public Class260 method10629(int var1) {
      return this.aClass260_11712;
   }

   public abstract boolean method10630(int var1);

   public abstract boolean method10631(int var1);

   public Class260 method10632(int var1) {
      return this.aClass260_11713;
   }

   public String method10633() {
      String var1 = this.aClass260_11713.toString() + " " + this.aString11711;
      if(this.aString11710 != null && !"".equals(this.aString11710)) {
         var1 = var1 + " : " + this.aString11710;
      }

      return var1;
   }

   public abstract boolean method10634(int var1);

   public String toString() {
      String var1 = this.aClass260_11713.toString() + " " + this.aString11711;
      if(this.aString11710 != null && !"".equals(this.aString11710)) {
         var1 = var1 + " : " + this.aString11710;
      }

      return var1;
   }

   public int method10635() {
      if(Class260.aClass260_2839 != this.aClass260_11713) {
         throw new IllegalArgumentException_Sub1(this, this.aClass260_11713.toString().toLowerCase());
      } else {
         return this.anInt11714 * -520348339;
      }
   }

   public int method10636() {
      if(Class260.aClass260_2839 != this.aClass260_11713) {
         throw new IllegalArgumentException_Sub1(this, this.aClass260_11713.toString().toLowerCase());
      } else {
         return this.anInt11714 * -520348339;
      }
   }

   public int method10637() {
      if(Class260.aClass260_2839 != this.aClass260_11713) {
         throw new IllegalArgumentException_Sub1(this, this.aClass260_11713.toString().toLowerCase());
      } else {
         return this.anInt11714 * -520348339;
      }
   }

   public abstract int method10638(int var1);

   public static void method10639(int var0, short var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(5, (long)var0);
      var2.method10583((byte)-14);
   }
}
