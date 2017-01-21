package com.jagex;

import com.jagex.Class192;
import com.jagex.Class204;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class265;
import com.jagex.Class40;
import com.jagex.Class451;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class681;
import com.jagex.Interface12;
import java.util.Iterator;

class Class42 implements Iterator {
   int anInt455;
   // $FF: synthetic field
   Class40 this$0;

   public void method890() {
      throw new UnsupportedOperationException();
   }

   public boolean hasNext() {
      return 298338649 * this.anInt455 < this.this$0.anInt447 * 483728625;
   }

   public Object next() {
      int var1 = (this.anInt455 += -476483863) * 298338649 - 1;
      Class192 var2 = this.this$0.aClass192_448;
      synchronized(var2) {
         Interface12 var3 = (Interface12)this.this$0.aClass192_448.method2765((long)var1);
         if(null != var3) {
            return var3;
         }
      }

      return this.this$0.method863(var1, -1989116259);
   }

   public void method891() {
      throw new UnsupportedOperationException();
   }

   public void method892() {
      throw new UnsupportedOperationException();
   }

   public void method893() {
      throw new UnsupportedOperationException();
   }

   public void method894() {
      throw new UnsupportedOperationException();
   }

   public boolean method895() {
      return 298338649 * this.anInt455 < this.this$0.anInt447 * 483728625;
   }

   Class42(Class40 var1) {
      this.this$0 = var1;
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public Object method896() {
      int var1 = (this.anInt455 += -476483863) * 298338649 - 1;
      Class192 var2 = this.this$0.aClass192_448;
      synchronized(var2) {
         Interface12 var3 = (Interface12)this.this$0.aClass192_448.method2765((long)var1);
         if(null != var3) {
            return var3;
         }
      }

      return this.this$0.method863(var1, -2037053016);
   }

   public Object method897() {
      int var1 = (this.anInt455 += -476483863) * 298338649 - 1;
      Class192 var2 = this.this$0.aClass192_448;
      synchronized(var2) {
         Interface12 var3 = (Interface12)this.this$0.aClass192_448.method2765((long)var1);
         if(null != var3) {
            return var3;
         }
      }

      return this.this$0.method863(var1, -2118781500);
   }

   static final void method898(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class451.localPlayer.aClass633_12181 != null && Class451.localPlayer.aClass633_12181.aBool8251?1:0;
   }

   public static void method899(int var0, int var1) {
      Class526_Sub21_Sub9 var2 = Class265.method3560(21, (long)var0);
      var2.method10583((byte)-113);
   }

   static final void method900(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var2.anInt8623 -= 379191958;
      int var4 = var2.anIntArray8622[-1730576285 * var2.anInt8623];
      int var5 = var2.anIntArray8622[1 + -1730576285 * var2.anInt8623];
      if(-1 == var4 && var5 == -1) {
         var0.aClass245_2598 = null;
      } else {
         var0.aClass245_2598 = Class204.method2893(var4, var5, -907705591);
      }

   }
}
