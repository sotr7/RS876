package com.jagex;

import com.jagex.AbstractQueue_Sub1;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class264;
import com.jagex.Class315_Sub1;
import com.jagex.Class326;
import com.jagex.Class451;
import com.jagex.Class501;
import com.jagex.Class632;
import com.jagex.Class681;
import com.jagex.Class690;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Class393 implements Iterator {
   static int anInt4097;
   int anInt4094 = 0;
   int anInt4096;
   AbstractQueue_Sub1 anAbstractQueue_Sub1_4095;

   public void method4794() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      return this.anInt4094 * -1299028309 < 841670101 * this.anAbstractQueue_Sub1_4095.anInt11881;
   }

   public void method4795() {
      throw new UnsupportedOperationException();
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public boolean method4796() {
      return this.anInt4094 * -1299028309 < 841670101 * this.anAbstractQueue_Sub1_4095.anInt11881;
   }

   public void method4797() {
      throw new UnsupportedOperationException();
   }

   public Object method4798() {
      if(this.anInt4096 * -566762461 != this.anAbstractQueue_Sub1_4095.anInt11882 * 1085345177) {
         throw new ConcurrentModificationException();
      } else if(-1299028309 * this.anInt4094 < this.anAbstractQueue_Sub1_4095.anInt11881 * 841670101) {
         Object var1 = this.anAbstractQueue_Sub1_4095.aClass398Array11880[this.anInt4094 * -1299028309].anObject4128;
         this.anInt4094 += 545940483;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void method4799() {
      throw new UnsupportedOperationException();
   }

   public Object next() {
      if(this.anInt4096 * -566762461 != this.anAbstractQueue_Sub1_4095.anInt11882 * 1085345177) {
         throw new ConcurrentModificationException();
      } else if(-1299028309 * this.anInt4094 < this.anAbstractQueue_Sub1_4095.anInt11881 * 841670101) {
         Object var1 = this.anAbstractQueue_Sub1_4095.aClass398Array11880[this.anInt4094 * -1299028309].anObject4128;
         this.anInt4094 += 545940483;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public void method4800() {
      throw new UnsupportedOperationException();
   }

   public Object method4801() {
      if(this.anInt4096 * -566762461 != this.anAbstractQueue_Sub1_4095.anInt11882 * 1085345177) {
         throw new ConcurrentModificationException();
      } else if(-1299028309 * this.anInt4094 < this.anAbstractQueue_Sub1_4095.anInt11881 * 841670101) {
         Object var1 = this.anAbstractQueue_Sub1_4095.aClass398Array11880[this.anInt4094 * -1299028309].anObject4128;
         this.anInt4094 += 545940483;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   Class393(AbstractQueue_Sub1 var1) {
      this.anInt4096 = 1845417235 * this.anAbstractQueue_Sub1_4095.anInt11882;
      this.anAbstractQueue_Sub1_4095 = var1;
   }

   static final void method4802(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class690.method8098(4, var2, var3, "", 535165143);
   }

   static final void method4803(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-1);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class501.method6014(var3, var4, var0, -378698040);
   }

   static final void method4804(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      if(Class451.localPlayer.aClass633_12181 != null) {
         int var4;
         for(var4 = 0; var4 < Class326.anIntArray3485.length; ++var4) {
            if(Class326.anIntArray3485[var4] == var2) {
               Class451.localPlayer.aClass633_12181.method7495(var4, var3, Class264.aClass40_Sub9_2970, 543026459);
               return;
            }
         }

         for(var4 = 0; var4 < Class326.anIntArray3486.length; ++var4) {
            if(Class326.anIntArray3486[var4] == var2) {
               Class451.localPlayer.aClass633_12181.method7495(var4, var3, Class264.aClass40_Sub9_2970, 1103159481);
               return;
            }
         }

      }
   }

   static final void method4805(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)113);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class632.method7489(var3, var4, var0, (short)133);
   }

   static final void method4806(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      int var4 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      int var5 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285];
      if(var5 >= 1 && var5 <= 10) {
         var0.method3376(var5 - 1, var4, (byte)-9);
      }

   }
}
