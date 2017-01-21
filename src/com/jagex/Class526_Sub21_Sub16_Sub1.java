package com.jagex;

import com.jagex.Class526_Sub21_Sub16;
import com.jagex.Interface71;
import java.lang.ref.SoftReference;

public class Class526_Sub21_Sub16_Sub1 extends Class526_Sub21_Sub16 {
   SoftReference aSoftReference12146;

   boolean method10712() {
      return true;
   }

   Object method10709() {
      return this.aSoftReference12146.get();
   }

   Class526_Sub21_Sub16_Sub1(Interface71 var1, Object var2, int var3) {
      super(var1, var3);
      this.aSoftReference12146 = new SoftReference(var2);
   }

   Object method10711() {
      return this.aSoftReference12146.get();
   }

   boolean method10710() {
      return true;
   }
}
