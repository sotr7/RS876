package com.jagex;

import com.jagex.AbstractQueue_Sub1;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class442;
import com.jagex.Class456;
import com.jagex.Class468;
import com.jagex.Class472;
import com.jagex.Class526_Sub31;
import com.jagex.Class526_Sub9;
import com.jagex.Class681;
import com.jagex.Class711_Sub8;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class467 {
   Comparator aComparator5337;
   long aLong5340;
   int anInt5341;
   Class456 aClass456_5339;
   Map aMap5336;
   AbstractQueue_Sub1 anAbstractQueue_Sub1_5335;
   AbstractQueue_Sub1 anAbstractQueue_Sub1_5338;

   boolean method5592(byte var1) {
      return 9001759 * this.anInt5341 != -1;
   }

   public Object method5593(Object var1, int var2) {
      synchronized(this) {
         if(this.aLong5340 * -4148374408473601519L != -1L) {
            this.method5595(-1933311553);
         }

         Class468 var4 = (Class468)this.aMap5336.get(var1);
         if(var4 == null) {
            return null;
         } else {
            this.method5596(var4, false, 881885176);
            return var4.anObject5345;
         }
      }
   }

   public Object method5594(Object var1, Object var2, int var3) {
      synchronized(this) {
         if(-1L != this.aLong5340 * -4148374408473601519L) {
            this.method5595(-2106733627);
         }

         Class468 var5 = (Class468)this.aMap5336.get(var1);
         if(null != var5) {
            Object var9 = var5.anObject5345;
            var5.anObject5345 = var2;
            this.method5596(var5, false, -569882417);
            return var9;
         } else {
            Class468 var6;
            if(this.method5592((byte)-2) && this.aMap5336.size() == 9001759 * this.anInt5341) {
               var6 = (Class468)this.anAbstractQueue_Sub1_5338.remove();
               this.aMap5336.remove(var6.anObject5343);
               this.anAbstractQueue_Sub1_5335.remove(var6);
            }

            var6 = new Class468(var2, var1);
            this.aMap5336.put(var1, var6);
            this.method5596(var6, true, 1375283506);
            return null;
         }
      }
   }

   void method5595(int var1) {
      if(-1L == this.aLong5340 * -4148374408473601519L) {
         throw new IllegalStateException("");
      } else {
         long var2 = System.currentTimeMillis() - -4148374408473601519L * this.aLong5340;

         while(!this.anAbstractQueue_Sub1_5335.isEmpty()) {
            Class468 var4 = (Class468)this.anAbstractQueue_Sub1_5335.peek();
            if(var4.aLong5344 * -2736634324646376187L >= var2) {
               return;
            }

            this.aMap5336.remove(var4.anObject5343);
            this.anAbstractQueue_Sub1_5335.remove(var4);
            if(this.method5592((byte)-2)) {
               this.anAbstractQueue_Sub1_5338.remove(var4);
            }
         }

      }
   }

   public Class467(int var1, Class456 var2) {
      this(-1L, var1, var2);
   }

   Class467(long var1, int var3, Class456 var4) {
      this.aComparator5337 = new Class472(this);
      this.aLong5340 = var1 * 3517576945672787697L;
      this.anInt5341 = -1575853857 * var3;
      this.aClass456_5339 = var4;
      if(-1 == this.anInt5341 * 9001759) {
         this.aMap5336 = new HashMap(64);
         this.anAbstractQueue_Sub1_5335 = new AbstractQueue_Sub1(64, this.aComparator5337);
         this.anAbstractQueue_Sub1_5338 = null;
      } else {
         if(this.aClass456_5339 == null) {
            throw new IllegalArgumentException("");
         }

         this.aMap5336 = new HashMap(9001759 * this.anInt5341);
         this.anAbstractQueue_Sub1_5335 = new AbstractQueue_Sub1(9001759 * this.anInt5341, this.aComparator5337);
         this.anAbstractQueue_Sub1_5338 = new AbstractQueue_Sub1(this.anInt5341 * 9001759);
      }

   }

   void method5596(Class468 var1, boolean var2, int var3) {
      if(!var2) {
         this.anAbstractQueue_Sub1_5335.remove(var1);
         if(this.method5592((byte)-2) && !this.anAbstractQueue_Sub1_5338.remove(var1)) {
            throw new IllegalStateException("");
         }
      }

      var1.aLong5344 = System.currentTimeMillis() * -5357913674076522547L;
      if(this.method5592((byte)-2)) {
         switch(this.aClass456_5339.anInt5159 * -1267738483) {
         case 0:
            var1.aLong5342 = var1.aLong5344 * -2912524786601002079L;
            break;
         case 1:
            var1.aLong5342 += 562842372205991661L;
         }

         this.anAbstractQueue_Sub1_5338.add(var1);
      }

      this.anAbstractQueue_Sub1_5335.add(var1);
   }

   void method5597() {
      if(-1L == this.aLong5340 * -4148374408473601519L) {
         throw new IllegalStateException("");
      } else {
         long var1 = System.currentTimeMillis() - -4148374408473601519L * this.aLong5340;

         while(!this.anAbstractQueue_Sub1_5335.isEmpty()) {
            Class468 var3 = (Class468)this.anAbstractQueue_Sub1_5335.peek();
            if(var3.aLong5344 * -2736634324646376187L >= var1) {
               return;
            }

            this.aMap5336.remove(var3.anObject5343);
            this.anAbstractQueue_Sub1_5335.remove(var3);
            if(this.method5592((byte)-2)) {
               this.anAbstractQueue_Sub1_5338.remove(var3);
            }
         }

      }
   }

   static final void method5598(Class681 var0, int var1) {
      Class711_Sub8.method9915(Class442.method5197((byte)92), var0, (byte)68);
   }

   static final void method5599(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      var2.anInt8623 -= 379191958;
      var0.anInt2522 = var2.anIntArray8622[var2.anInt8623 * -1730576285] * 1236937723;
      var0.anInt2523 = 2020733411 * var2.anIntArray8622[1 + var2.anInt8623 * -1730576285];
      Class526_Sub31.method9555(var0, (byte)10);
      if(-449120703 * var0.type == 0) {
         Class526_Sub9.method9361(var1, var0, false, (byte)126);
      }

   }
}
