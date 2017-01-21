package com.jagex;

import com.jagex.Class230;
import com.jagex.InterfaceDef;
import com.jagex.Class326;
import com.jagex.Class466;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class698;
import com.jagex.Interface12;
import com.jagex.Interface14;
import com.jagex.Interface7;

public class Class327 implements Interface7 {
   public static int anInt3488;
   Class466 aClass466_3487;

   Class327(Class466 var1) {
      this.aClass466_3487 = var1;
   }

   public Interface12 method64(int var1, Interface14 var2, int var3) {
      return new Class326(var1, this.aClass466_3487);
   }

   public Class method59(int var1) {
      return Class326.class;
   }

   public Interface12 method61(int var1, Interface14 var2) {
      return new Class326(var1, this.aClass466_3487);
   }

   public Class method63() {
      return Class326.class;
   }

   public Class method62() {
      return Class326.class;
   }

   public Class method60() {
      return Class326.class;
   }

   static final void method4196(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.hidden?1:0;
   }

   static final void method4197(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub18_10619.method10015(-1679100832);
   }

   static Class698[] method4198(int var0) {
      return new Class698[]{Class698.aClass698_8765, Class698.aClass698_8763, Class698.aClass698_8764};
   }

   static final void method4199(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2544 * 656480735;
   }
}
