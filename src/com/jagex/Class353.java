package com.jagex;

import com.jagex.Class166;
import com.jagex.Class452;

public class Class353 {
   static final int anInt3682 = 16;
   public int anInt3681;
   int anInt3684;
   int anInt3686;
   Class166 aClass166_3687;
   public int anInt3671;
   public static Class353 aClass353_3685;
   public static Class353 aClass353_3673;
   public static Class353 aClass353_3679;
   public static Class353 aClass353_3672;
   public static Class353 aClass353_3683;
   public static Class353 aClass353_3674;
   public static Class353 aClass353_3675;
   static Class353 aClass353_3676;
   static Class353 aClass353_3677;
   static Class353 aClass353_3678;
   static Class353 aClass353_3670;
   static Class353 aClass353_3680;
   static int anInt3669;

   static Class353 method4565(int var0) {
      switch(var0) {
      case 0:
         return aClass353_3685;
      case 1:
         return aClass353_3673;
      case 2:
         return aClass353_3679;
      case 3:
         return aClass353_3672;
      case 4:
         return aClass353_3683;
      case 5:
         return aClass353_3674;
      case 6:
         return aClass353_3675;
      default:
         return null;
      }
   }

   Class353(int var1, int var2, int var3, Class166 var4) {
      this.anInt3681 = var1;
      this.anInt3684 = var2;
      this.anInt3686 = var3;
      this.aClass166_3687 = var4;
      this.anInt3671 = this.anInt3686 * this.aClass166_3687.anInt1891 * 1990758583;
      if(this.anInt3684 >= 16) {
         throw new RuntimeException();
      }
   }

   static {
      aClass353_3685 = new Class353(3, 0, 3, Class166.aClass166_1892);
      aClass353_3673 = new Class353(11, 1, 3, Class166.aClass166_1892);
      aClass353_3679 = new Class353(9, 2, 4, Class166.aClass166_1884);
      aClass353_3672 = new Class353(10, 3, 1, Class166.aClass166_1892);
      aClass353_3683 = new Class353(5, 4, 2, Class166.aClass166_1892);
      aClass353_3674 = new Class353(4, 5, 3, Class166.aClass166_1892);
      aClass353_3675 = new Class353(6, 6, 4, Class166.aClass166_1892);
      aClass353_3676 = new Class353(2, 7, 4, Class166.aClass166_1892);
      aClass353_3677 = new Class353(1, 8, 4, Class166.aClass166_1892);
      aClass353_3678 = new Class353(0, 9, 4, Class166.aClass166_1892);
      aClass353_3670 = new Class353(7, 10, 3, Class166.aClass166_1892);
      aClass353_3680 = new Class353(8, 11, 3, Class166.aClass166_1892);
      anInt3669 = Class452.method5370(16, (byte)-81);
   }
}
