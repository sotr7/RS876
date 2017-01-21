package com.jagex;

import com.jagex.Class97_Sub1;
import java.util.HashMap;
import java.util.Map;

public class Class91 {
   static Class91 aClass91_864 = new Class91(17, 0);
   static Class91 aClass91_884 = new Class91(10, 1);
   static Class91 aClass91_891 = new Class91(9, 2);
   static Class91 aClass91_867 = new Class91(12, 3);
   static Class91 aClass91_868 = new Class91(5, 10);
   static Class91 aClass91_869 = new Class91(18, 11);
   static Class91 aClass91_870 = new Class91(3, 12);
   static Class91 aClass91_871 = new Class91(28, 13);
   static Class91 aClass91_872 = new Class91(11, 14);
   static Class91 aClass91_873 = new Class91(13, 15);
   static Class91 aClass91_874 = new Class91(22, 16);
   static Class91 aClass91_875 = new Class91(14, 17);
   static Class91 aClass91_876 = new Class91(1, 20);
   static Class91 aClass91_865 = new Class91(2, 21);
   static Class91 aClass91_877 = new Class91(7, 22);
   static Class91 aClass91_879 = new Class91(8, 30);
   static Class91 aClass91_866 = new Class91(16, 31);
   static Class91 aClass91_881 = new Class91(29, 32);
   static Class91 aClass91_882 = new Class91(24, 33);
   static Class91 aClass91_883 = new Class91(23, 40);
   static Class91 aClass91_890 = new Class91(25, 41);
   static Class91 aClass91_885 = new Class91(30, 42);
   static Class91 aClass91_894 = new Class91(20, 43);
   static Class91 aClass91_880 = new Class91(6, 50);
   static Class91 aClass91_888 = new Class91(4, 51);
   static Class91 aClass91_889 = new Class91(19, 52);
   static Class91 aClass91_893 = new Class91(27, 53);
   static Class91 aClass91_887 = new Class91(15, 60);
   static Class91 aClass91_892 = new Class91(21, 61);
   static Class91 aClass91_878 = new Class91(26, 70);
   static Class91 aClass91_886 = new Class91(0, 255);
   public int anInt895;
   int anInt896;

   Class91(int var1, int var2) {
      this.anInt895 = -531832779 * var1;
      this.anInt896 = -1591689103 * var2;
   }

   public static Map method1211(Class97_Sub1[] var0, int var1) {
      if(var0 != null && var0.length != 0) {
         HashMap var2 = new HashMap();
         Class97_Sub1[] var3 = var0;

         for(int var4 = 0; var4 < var3.length; ++var4) {
            Class97_Sub1 var5 = var3[var4];
            var2.put(var5.aClass452_8927, var5);
         }

         return var2;
      } else {
         return null;
      }
   }
}
