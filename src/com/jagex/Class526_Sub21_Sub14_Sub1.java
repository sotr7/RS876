package com.jagex;

import com.jagex.Class526_Sub21_Sub14;
import java.lang.ref.SoftReference;

public class Class526_Sub21_Sub14_Sub1 extends Class526_Sub21_Sub14 {
   SoftReference aSoftReference12065;

   Object method10699(int var1) {
      return this.aSoftReference12065.get();
   }

   Class526_Sub21_Sub14_Sub1(Object var1, int var2) {
      super(var2);
      this.aSoftReference12065 = new SoftReference(var1);
   }

   boolean method10698(byte var1) {
      return true;
   }

   Object method10701() {
      return this.aSoftReference12065.get();
   }

   Object method10702() {
      return this.aSoftReference12065.get();
   }

   boolean method10700() {
      return true;
   }
}
