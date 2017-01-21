package com.jagex;

import com.jagex.Class242;
import com.jagex.NPCDef;
import com.jagex.NPC;
import com.jagex.Class681;
import com.jagex.Class701;

public final class Class398 {
   Object anObject4128;
   int anInt4129;

   Class398(Object var1, int var2) {
      this.anObject4128 = var1;
      this.anInt4129 = var2 * 773041025;
   }

   static final void method4827(Class681 var0, byte var1) {
      NPC var2 = (NPC)var0.aClass639_Sub1_Sub2_Sub1_8635;
      String var3 = var2.aString12194;
      NPCDef var4 = var2.def;
      if(null != var4.morphisms) {
         var4 = var4.method4049(Class242.aClass94_2456, Class242.aClass94_2456, 182793117);
         if(var4 == null) {
            var3 = "";
         } else {
            var3 = var4.name;
         }
      }

      if(null == var3) {
         var3 = "";
      }

      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3;
   }

   static Class701[] method4828(short var0) {
      return new Class701[]{Class701.aClass701_8779, Class701.aClass701_8782, Class701.aClass701_8780, Class701.aClass701_8784, Class701.aClass701_8781};
   }
}
