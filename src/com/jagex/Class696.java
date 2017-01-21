package com.jagex;

import com.jagex.Class526_Sub21;
import com.jagex.Class697;
import java.util.Iterator;

public class Class696 implements Iterable {
   public Class526_Sub21 aClass526_Sub21_8758 = new Class526_Sub21();
   Class526_Sub21 aClass526_Sub21_8759;

   public void method8134() {
      while(this.aClass526_Sub21_8758.aClass526_Sub21_10531 != this.aClass526_Sub21_8758) {
         this.aClass526_Sub21_8758.aClass526_Sub21_10531.uncache(216073951);
      }

   }

   public void method8135(byte var1) {
      while(this.aClass526_Sub21_8758.aClass526_Sub21_10531 != this.aClass526_Sub21_8758) {
         this.aClass526_Sub21_8758.aClass526_Sub21_10531.uncache(-338815942);
      }

   }

   public Class696() {
      this.aClass526_Sub21_8758.aClass526_Sub21_10531 = this.aClass526_Sub21_8758;
      this.aClass526_Sub21_8758.aClass526_Sub21_10532 = this.aClass526_Sub21_8758;
   }

   public int method8136(int var1) {
      int var2 = 0;

      for(Class526_Sub21 var3 = this.aClass526_Sub21_8758.aClass526_Sub21_10531; var3 != this.aClass526_Sub21_8758; var3 = var3.aClass526_Sub21_10531) {
         ++var2;
      }

      return var2;
   }

   Class526_Sub21 method8137(Class526_Sub21 var1, int var2) {
      Class526_Sub21 var3;
      if(var1 == null) {
         var3 = this.aClass526_Sub21_8758.aClass526_Sub21_10531;
      } else {
         var3 = var1;
      }

      if(var3 == this.aClass526_Sub21_8758) {
         this.aClass526_Sub21_8759 = null;
         return null;
      } else {
         this.aClass526_Sub21_8759 = var3.aClass526_Sub21_10531;
         return var3;
      }
   }

   public Class526_Sub21 poll(int var1) {
      Class526_Sub21 var2 = this.aClass526_Sub21_8758.aClass526_Sub21_10531;
      if(var2 == this.aClass526_Sub21_8758) {
         return null;
      } else {
         var2.uncache(1068520292);
         return var2;
      }
   }

   public Class526_Sub21 method8139(int var1) {
      Class526_Sub21 var2 = this.aClass526_Sub21_8759;
      if(this.aClass526_Sub21_8758 == var2) {
         this.aClass526_Sub21_8759 = null;
         return null;
      } else {
         this.aClass526_Sub21_8759 = var2.aClass526_Sub21_10531;
         return var2;
      }
   }

   public Iterator iterator() {
      return new Class697(this);
   }

   public Iterator method8140() {
      return new Class697(this);
   }

   public Iterator method8141() {
      return new Class697(this);
   }

   public void offer(Class526_Sub21 var1, byte var2) {
      if(var1.aClass526_Sub21_10532 != null) {
         var1.uncache(538062610);
      }

      var1.aClass526_Sub21_10532 = this.aClass526_Sub21_8758.aClass526_Sub21_10532;
      var1.aClass526_Sub21_10531 = this.aClass526_Sub21_8758;
      var1.aClass526_Sub21_10532.aClass526_Sub21_10531 = var1;
      var1.aClass526_Sub21_10531.aClass526_Sub21_10532 = var1;
   }

   public Class526_Sub21 method8143(byte var1) {
      return this.method8137((Class526_Sub21)null, -1511642903);
   }

   public void method8144() {
      while(this.aClass526_Sub21_8758.aClass526_Sub21_10531 != this.aClass526_Sub21_8758) {
         this.aClass526_Sub21_8758.aClass526_Sub21_10531.uncache(658300549);
      }

   }

   public int method8145() {
      int var1 = 0;

      for(Class526_Sub21 var2 = this.aClass526_Sub21_8758.aClass526_Sub21_10531; var2 != this.aClass526_Sub21_8758; var2 = var2.aClass526_Sub21_10531) {
         ++var1;
      }

      return var1;
   }

   public int method8146() {
      int var1 = 0;

      for(Class526_Sub21 var2 = this.aClass526_Sub21_8758.aClass526_Sub21_10531; var2 != this.aClass526_Sub21_8758; var2 = var2.aClass526_Sub21_10531) {
         ++var1;
      }

      return var1;
   }
}
