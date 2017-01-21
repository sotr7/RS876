package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class434;
import com.jagex.Class526_Sub21;
import com.jagex.Class681;
import com.jagex.Class696;
import com.jagex.client;
import java.util.Iterator;

public class Class697 implements Iterator {
   Class526_Sub21 aClass526_Sub21_8761;
   Class526_Sub21 aClass526_Sub21_8760 = null;
   Class696 aClass696_8762;

   public boolean method8147() {
      return this.aClass526_Sub21_8761 != this.aClass696_8762.aClass526_Sub21_8758;
   }

   void method8148(int var1) {
      this.aClass526_Sub21_8761 = this.aClass696_8762.aClass526_Sub21_8758.aClass526_Sub21_10531;
      this.aClass526_Sub21_8760 = null;
   }

   public Class526_Sub21 method8149(int var1) {
      this.method8148(258105436);
      return (Class526_Sub21)this.next();
   }

   public Object next() {
      Class526_Sub21 var1 = this.aClass526_Sub21_8761;
      if(var1 == this.aClass696_8762.aClass526_Sub21_8758) {
         var1 = null;
         this.aClass526_Sub21_8761 = null;
      } else {
         this.aClass526_Sub21_8761 = var1.aClass526_Sub21_10531;
      }

      this.aClass526_Sub21_8760 = var1;
      return var1;
   }

   public boolean hasNext() {
      return this.aClass526_Sub21_8761 != this.aClass696_8762.aClass526_Sub21_8758;
   }

   public Class697(Class696 var1) {
      this.aClass696_8762 = var1;
      this.aClass526_Sub21_8761 = this.aClass696_8762.aClass526_Sub21_8758.aClass526_Sub21_10531;
      this.aClass526_Sub21_8760 = null;
   }

   public Object method8150() {
      Class526_Sub21 var1 = this.aClass526_Sub21_8761;
      if(var1 == this.aClass696_8762.aClass526_Sub21_8758) {
         var1 = null;
         this.aClass526_Sub21_8761 = null;
      } else {
         this.aClass526_Sub21_8761 = var1.aClass526_Sub21_10531;
      }

      this.aClass526_Sub21_8760 = var1;
      return var1;
   }

   public void remove() {
      if(null == this.aClass526_Sub21_8760) {
         throw new IllegalStateException();
      } else {
         this.aClass526_Sub21_8760.uncache(101626062);
         this.aClass526_Sub21_8760 = null;
      }
   }

   public Object method8151() {
      Class526_Sub21 var1 = this.aClass526_Sub21_8761;
      if(var1 == this.aClass696_8762.aClass526_Sub21_8758) {
         var1 = null;
         this.aClass526_Sub21_8761 = null;
      } else {
         this.aClass526_Sub21_8761 = var1.aClass526_Sub21_10531;
      }

      this.aClass526_Sub21_8760 = var1;
      return var1;
   }

   public void method8152() {
      if(null == this.aClass526_Sub21_8760) {
         throw new IllegalStateException();
      } else {
         this.aClass526_Sub21_8760.uncache(-625849576);
         this.aClass526_Sub21_8760 = null;
      }
   }

   public void method8153() {
      if(null == this.aClass526_Sub21_8760) {
         throw new IllegalStateException();
      } else {
         this.aClass526_Sub21_8760.uncache(484892550);
         this.aClass526_Sub21_8760 = null;
      }
   }

   public void method8154() {
      if(null == this.aClass526_Sub21_8760) {
         throw new IllegalStateException();
      } else {
         this.aClass526_Sub21_8760.uncache(1949748600);
         this.aClass526_Sub21_8760 = null;
      }
   }

   public void method8155() {
      if(null == this.aClass526_Sub21_8760) {
         throw new IllegalStateException();
      } else {
         this.aClass526_Sub21_8760.uncache(1747621849);
         this.aClass526_Sub21_8760 = null;
      }
   }

   public void method8156() {
      if(null == this.aClass526_Sub21_8760) {
         throw new IllegalStateException();
      } else {
         this.aClass526_Sub21_8760.uncache(149729577);
         this.aClass526_Sub21_8760 = null;
      }
   }

   public static void method8157(int var0) {
      InterfaceDef.aClass192_2489.method2772(-2003090868);
      InterfaceDef.aClass192_2492.method2772(864985556);
      InterfaceDef.aClass192_2490.method2772(-621632399);
      InterfaceDef.aClass192_2559.method2772(595517801);
   }

   static final void method8158(Class681 var0, short var1) {
      var0.anInt8623 -= 379191958;
      client.aShort11185 = (short)var0.anIntArray8622[-1730576285 * var0.anInt8623];
      if(client.aShort11185 <= 0) {
         client.aShort11185 = 256;
      }

      client.aShort11277 = (short)var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      if(client.aShort11277 <= 0) {
         client.aShort11277 = 320;
      }

   }

   static final void method8159(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)93);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class434.method5147(var3, var4, var0, (byte)-29);
   }
}
