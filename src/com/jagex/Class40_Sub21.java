package com.jagex;

import com.jagex.Class20;
import com.jagex.Class26;
import com.jagex.Class40;
import com.jagex.Class466;
import com.jagex.Class526;
import com.jagex.Class642;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class84;

public class Class40_Sub21 extends Class40 {
   public Class40_Sub21(Class676 var1, Class673 var2, Class466 var3) {
      super(var1, var2, var3, Class642.aClass642_8380, 64, new Class26(Class84.class));
   }

   static final void method10299(int var0, Class20 var1, int var2) {
      if(var0 != -1) {
         if(var1.get((long)var0) == null) {
            var1.put(new Class526(), (long)var0);
         }
      }
   }
}
