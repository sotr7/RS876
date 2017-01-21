package com.jagex;

import com.jagex.Class230;
import com.jagex.Class616;
import com.jagex.Class681;
import com.jagex.client;
import java.util.Iterator;

public class Class615 implements Iterator {
   public static int anInt8092;
   int anInt8091;
   Class616[] aClass616Array8090;

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      return this.anInt8091 * -1791529969 < this.aClass616Array8090.length;
   }

   public Object next() {
      return this.aClass616Array8090[(this.anInt8091 += -722074897) * -1791529969 - 1];
   }

   public void method7271() {
      throw new UnsupportedOperationException();
   }

   public boolean method7272() {
      return this.anInt8091 * -1791529969 < this.aClass616Array8090.length;
   }

   public void method7273() {
      throw new UnsupportedOperationException();
   }

   public void method7274() {
      throw new UnsupportedOperationException();
   }

   Class615(Class616[] var1) {
      this.aClass616Array8090 = var1;
   }

   public void method7275() {
      throw new UnsupportedOperationException();
   }

   public void method7276() {
      throw new UnsupportedOperationException();
   }

   public Object method7277() {
      return this.aClass616Array8090[(this.anInt8091 += -722074897) * -1791529969 - 1];
   }

   public Object method7278() {
      return this.aClass616Array8090[(this.anInt8091 += -722074897) * -1791529969 - 1];
   }

   static final void method7279(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.anIntArray8643[var0.anIntArray8642[-244840757 * var0.anInt8644]];
   }

   static final Object[] method7280(String var0, Class681 var1, int var2) {
      Object[] var3 = new Object[var0.length() + 1];

      int var4;
      for(var4 = var3.length - 1; var4 >= 1; --var4) {
         if(var0.charAt(var4 - 1) == 115) {
            var3[var4] = var1.anObjectArray8624[(var1.anInt8625 -= 2019513325) * 540934629];
         } else if(var0.charAt(var4 - 1) == 108) {
            var3[var4] = new Long(var1.aLongArray8626[(var1.anInt8630 -= 1112803603) * -1032509157]);
         } else {
            var3[var4] = new Integer(var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285]);
         }
      }

      var4 = var1.anIntArray8622[(var1.anInt8623 -= -1957887669) * -1730576285];
      if(-1 != var4) {
         var3[0] = new Integer(var4);
      } else {
         var3 = null;
      }

      return var3;
   }

   static final void method7281(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(0 != 2029719417 * client.anInt11288 && var2 < -87727903 * client.anInt11218) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = client.aClass25Array11169[var2].aString243;
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      }

   }

   static final void method7282(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub3_10644.method8313(var2, -1225149362);
   }
}
