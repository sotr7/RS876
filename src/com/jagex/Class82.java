package com.jagex;

import com.jagex.Interface76;

public class Class82 implements Interface76 {
   int anInt839;
   int anInt830;
   String aString841;
   public static Class82 aClass82_832 = new Class82(5, 0, "", "");
   static Class82 aClass82_831 = new Class82(7, 1, "", "");
   static Class82 aClass82_836 = new Class82(8, 2, "", "");
   public static Class82 aClass82_833 = new Class82(6, 3, "", "");
   static Class82 aClass82_834 = new Class82(0, 4, "", "");
   public static Class82 aClass82_840 = new Class82(3, 5, "", "");
   public static Class82 aClass82_837 = new Class82(4, 6, "", "");
   static Class82 aClass82_835 = new Class82(2, 7, "", "");
   public static Class82 aClass82_838;

   Class82(int var1, int var2, String var3, String var4, boolean var5, Class82[] var6) {
      this.anInt839 = var1 * 1775951633;
      this.anInt830 = -958020051 * var2;
      this.aString841 = var4;
   }

   public String method1166() {
      return this.aString841;
   }

   Class82(int var1, int var2, String var3, String var4) {
      this.anInt839 = var1 * 1775951633;
      this.anInt830 = -958020051 * var2;
      this.aString841 = var4;
   }

   public int getId() {
      return this.anInt830 * 1638693285;
   }

   static {
      aClass82_838 = new Class82(1, -1, "", "", true, new Class82[]{aClass82_832, aClass82_831, aClass82_836, aClass82_834, aClass82_833});
   }

   public int method21() {
      return this.anInt830 * 1638693285;
   }

   public String toString() {
      return this.aString841;
   }
}
