package com.jagex;

import com.jagex.Class108;
import com.jagex.Class31;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import com.jagex.Interface76;

public class Class606 implements Interface76 {
   static int anInt7911;
   int anInt7908;
   static Class606 aClass606_7910 = new Class606(0);
   static Class606 aClass606_7905 = new Class606(1);
   static Class606 aClass606_7906 = new Class606(2);
   static Class606 aClass606_7907 = new Class606(3);
   static Class606 aClass606_7904 = new Class606(4);
   static Class606 aClass606_7909 = new Class606(5);

   Class606(int var1) {
      this.anInt7908 = var1 * 1588962989;
   }

   public int getId() {
      return 1980542245 * this.anInt7908;
   }

   public int method21() {
      return 1980542245 * this.anInt7908;
   }

   static void method7131(Class526_Sub21_Sub6 var0, int var1) {
      if(var0 != null) {
         Class31.aClass702_292.method8176(var0, -177132194);
         Class31.anInt273 += 1354402097;
         Class526_Sub21_Sub7 var2 = null;
         if(!var0.aBool11649 && !"".equals(var0.aString11650)) {
            long var3 = -3207281156750170469L * var0.aLong11658;

            for(var2 = (Class526_Sub21_Sub7)Class31.aClass20_276.get(var3); null != var2 && !var2.aString11663.equals(var0.aString11650); var2 = (Class526_Sub21_Sub7)Class31.aClass20_276.method635(-1734407897)) {
               ;
            }

            if(var2 == null) {
               var2 = (Class526_Sub21_Sub7)Class31.aClass192_280.method2765(var3);
               if(var2 != null && !var2.aString11663.equals(var0.aString11650)) {
                  var2 = null;
               }

               if(var2 == null) {
                  var2 = new Class526_Sub21_Sub7(var0.aString11650);
               }

               Class31.aClass20_276.put(var2, var3);
               Class31.anInt274 += 1012670837;
            }
         } else {
            var2 = new Class526_Sub21_Sub7(var0.aString11650);
            Class31.anInt274 += 1012670837;
         }

         if(var2.method10579(var0, (byte)10)) {
            Class108.method1350(var2, -403313349);
         }

      }
   }
}
