package com.jagex;

import com.jagex.Class59;
import com.jagex.RuntimeException_Sub3;
import java.util.Iterator;

class Class63 implements Iterator {
   int anInt736;
   // $FF: synthetic field
   Class59 this$0;

   public Object method1061() {
      return this.this$0.anInterface12Array727[(this.anInt736 += 1000290513) * 330047537 - 1];
   }

   public void method1062() {
      throw new UnsupportedOperationException();
   }

   public Object next() {
      return this.this$0.anInterface12Array727[(this.anInt736 += 1000290513) * 330047537 - 1];
   }

   public boolean hasNext() {
      return 330047537 * this.anInt736 < this.this$0.anInterface12Array727.length;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public void method1063() {
      throw new UnsupportedOperationException();
   }

   public void method1064() {
      throw new UnsupportedOperationException();
   }

   public void method1065() {
      throw new UnsupportedOperationException();
   }

   Class63(Class59 var1) {
      this.this$0 = var1;
   }

   public boolean method1066() {
      return 330047537 * this.anInt736 < this.this$0.anInterface12Array727.length;
   }

   public void method1067() {
      throw new UnsupportedOperationException();
   }

   public Object method1068() {
      return this.this$0.anInterface12Array727[(this.anInt736 += 1000290513) * 330047537 - 1];
   }

   public static RuntimeException_Sub3 method1069(Throwable var0, String var1) {
      RuntimeException_Sub3 var2;
      if(var0 instanceof RuntimeException_Sub3) {
         var2 = (RuntimeException_Sub3)var0;
         var2.aString12072 = var2.aString12072 + '\u0020' + var1;
      } else {
         var2 = new RuntimeException_Sub3(var0, var1);
      }

      return var2;
   }
}
