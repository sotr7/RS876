package com.jagex;

import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class298;
import com.jagex.Class51;
import com.jagex.Class526;
import com.jagex.Class545;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.client;
import java.util.Iterator;

public class Class695 implements Iterator {
   static int anInt8753;
   public static Class51 aClass51_8757;
   Class526 aClass526_8754;
   Class526 aClass526_8755 = null;
   Class702 aClass702_8756;

   public Object method8118() {
      Class526 var1 = this.aClass526_8754;
      if(this.aClass702_8756.aClass526_8788 == var1) {
         var1 = null;
         this.aClass526_8754 = null;
      } else {
         this.aClass526_8754 = var1.aClass526_7157;
      }

      this.aClass526_8755 = var1;
      return var1;
   }

   void method8119(int var1) {
      this.aClass526_8754 = this.aClass702_8756.aClass526_8788.aClass526_7157;
      this.aClass526_8755 = null;
   }

   public Class526 method8120(int var1) {
      this.method8119(-591099242);
      return (Class526)this.next();
   }

   public Object next() {
      Class526 var1 = this.aClass526_8754;
      if(this.aClass702_8756.aClass526_8788 == var1) {
         var1 = null;
         this.aClass526_8754 = null;
      } else {
         this.aClass526_8754 = var1.aClass526_7157;
      }

      this.aClass526_8755 = var1;
      return var1;
   }

   public void remove() {
      if(null == this.aClass526_8755) {
         throw new IllegalStateException();
      } else {
         this.aClass526_8755.method6332(-1949449864);
         this.aClass526_8755 = null;
      }
   }

   public boolean method8121() {
      return this.aClass526_8754 != this.aClass702_8756.aClass526_8788;
   }

   public void method8122() {
      if(null == this.aClass526_8755) {
         throw new IllegalStateException();
      } else {
         this.aClass526_8755.method6332(-1949449864);
         this.aClass526_8755 = null;
      }
   }

   public void method8123() {
      if(null == this.aClass526_8755) {
         throw new IllegalStateException();
      } else {
         this.aClass526_8755.method6332(-1949449864);
         this.aClass526_8755 = null;
      }
   }

   public void method8124() {
      if(null == this.aClass526_8755) {
         throw new IllegalStateException();
      } else {
         this.aClass526_8755.method6332(-1949449864);
         this.aClass526_8755 = null;
      }
   }

   public Class695(Class702 var1) {
      this.aClass702_8756 = var1;
      this.aClass526_8754 = this.aClass702_8756.aClass526_8788.aClass526_7157;
      this.aClass526_8755 = null;
   }

   public void method8125() {
      if(null == this.aClass526_8755) {
         throw new IllegalStateException();
      } else {
         this.aClass526_8755.method6332(-1949449864);
         this.aClass526_8755 = null;
      }
   }

   public Object method8126() {
      Class526 var1 = this.aClass526_8754;
      if(this.aClass702_8756.aClass526_8788 == var1) {
         var1 = null;
         this.aClass526_8754 = null;
      } else {
         this.aClass526_8754 = var1.aClass526_7157;
      }

      this.aClass526_8755 = var1;
      return var1;
   }

   public void method8127() {
      if(null == this.aClass526_8755) {
         throw new IllegalStateException();
      } else {
         this.aClass526_8755.method6332(-1949449864);
         this.aClass526_8755 = null;
      }
   }

   void method8128() {
      this.aClass526_8754 = this.aClass702_8756.aClass526_8788.aClass526_7157;
      this.aClass526_8755 = null;
   }

   void method8129() {
      this.aClass526_8754 = this.aClass702_8756.aClass526_8788.aClass526_7157;
      this.aClass526_8755 = null;
   }

   public boolean hasNext() {
      return this.aClass526_8754 != this.aClass702_8756.aClass526_8788;
   }

   public void method8130(Class702 var1, int var2) {
      this.aClass702_8756 = var1;
      this.aClass526_8754 = this.aClass702_8756.aClass526_8788.aClass526_7157;
      this.aClass526_8755 = null;
   }

   static final void method8131(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.modelType = -1114622803;
      var0.anInt2539 = client.localPlayerIndex * -1697811977;
      var0.anInt2540 = 0;
      if(-1 == 1300712985 * var0.componentSlot && !var1.aBool2458) {
         Class545.method6515(var0.uid * 919258769, (byte)23);
      }

   }

   static final void method8132(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-27);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1700151229 * var3.anInt2529;
   }

   public static void method8133(boolean var0, int var1) {
      if(Class570.aBool7636 != var0) {
         Class298.method3983(-2130808287);
         Class570.aBool7636 = var0;
      }

   }
}
