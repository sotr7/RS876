package com.jagex;

import com.jagex.Class188;
import com.jagex.Class221;
import com.jagex.Class273;
import com.jagex.Class277;
import com.jagex.Class28;
import com.jagex.Class395;
import com.jagex.Class422;
import com.jagex.Class471;
import com.jagex.Class526_Sub21_Sub12;
import com.jagex.Class589;
import com.jagex.Class592;
import com.jagex.Class613;
import com.jagex.Class681;
import com.jagex.Class70;
import com.jagex.Class90;
import com.jagex.Exception_Sub1;

public final class Class468 implements Comparable {
   long aLong5342;
   long aLong5344;
   Object anObject5345;
   Object anObject5343;

   public boolean method5600(Object var1) {
      if(var1 instanceof Class468) {
         return this.anObject5343.equals(((Class468)var1).anObject5343);
      } else {
         throw new IllegalArgumentException();
      }
   }

   int method5601(Class468 var1, byte var2) {
      return this.aLong5342 * -399051225646663963L < var1.aLong5342 * -399051225646663963L?-1:(this.aLong5342 * -399051225646663963L > -399051225646663963L * var1.aLong5342?1:0);
   }

   public boolean equals(Object var1) {
      if(var1 instanceof Class468) {
         return this.anObject5343.equals(((Class468)var1).anObject5343);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int hashCode() {
      return this.anObject5343.hashCode();
   }

   public int compareTo(Object var1) {
      return this.method5601((Class468)var1, (byte)-5);
   }

   Class468(Object var1, Object var2) {
      this.anObject5345 = var1;
      this.anObject5343 = var2;
   }

   public int method5602() {
      return this.anObject5343.hashCode();
   }

   public boolean method5603(Object var1) {
      if(var1 instanceof Class468) {
         return this.anObject5343.equals(((Class468)var1).anObject5343);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean method5604(Object var1) {
      if(var1 instanceof Class468) {
         return this.anObject5343.equals(((Class468)var1).anObject5343);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public int method5605() {
      return this.anObject5343.hashCode();
   }

   static final void method5606(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub12 var3 = Class277.aClass56_3028.method994(var2, (byte)0);
      if(var3.anIntArray11807 == null) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anIntArray11807.length;
      }

   }

   static final void method5607(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1475009431 * Class188.anInt2147;
   }

   public static void method5608(Class613 var0, byte var1) {
      Class471.anInt5359 = var0.anInt8045 * 1181469443;
      Class28.anInt252 = var0.anInt8063 * 979320361;
      Class395.anInt4111 = -2140746787 * var0.anInt8064;
      Class422.anInt4739 = 1030018031 * var0.anInt8036;
      Class221.anInt2301 = -1909510383 * var0.anInt8066;
      Class28.anInt256 = var0.anInt8050 * 762520001;
      Class70.anInt789 = 1081021005 * var0.anInt8068;
      Class589.anInt7802 = var0.anInt8069 * -1446866269;
      Exception_Sub1.anInt11343 = var0.anInt8070 * 1021668403;
      Class273.anInt3008 = var0.anInt8071 * -1598085389;
      Class28.anInt257 = 533134627 * var0.anInt8072;
      Class90.anInt860 = 84723813 * var0.anInt8048;
   }

   static final void method5609(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class592.method7026(var2, -1844202784);
   }
}
