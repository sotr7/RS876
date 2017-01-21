package com.jagex;

import com.jagex.Class20;
import com.jagex.Class31;
import com.jagex.Class526;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub21_Sub7;
import java.util.Iterator;

public class Class3 implements Iterator {
   Class526 aClass526_22 = null;
   int anInt19;
   Class526 aClass526_20;
   Class20 aClass20_21;

   public void method522() {
      if(null == this.aClass526_22) {
         throw new IllegalStateException();
      } else {
         this.aClass526_22.method6332(-1949449864);
         this.aClass526_22 = null;
      }
   }

   public boolean hasNext() {
      if(this.aClass526_20 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
         return true;
      } else {
         while(this.anInt19 * 1943875965 < this.aClass20_21.anInt198 * -2110864949) {
            if(this.aClass20_21.aClass526Array200[(this.anInt19 += -731541547) * 1943875965 - 1].aClass526_7157 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
               this.aClass526_20 = this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1].aClass526_7157;
               return true;
            }

            this.aClass526_20 = this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1];
         }

         return false;
      }
   }

   public Class526 method523(int var1) {
      this.method529(725592130);
      return (Class526)this.next();
   }

   public Object next() {
      Class526 var1;
      if(this.aClass526_20 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
         var1 = this.aClass526_20;
         this.aClass526_20 = var1.aClass526_7157;
         this.aClass526_22 = var1;
         return var1;
      } else {
         do {
            if(1943875965 * this.anInt19 >= -2110864949 * this.aClass20_21.anInt198) {
               return null;
            }

            var1 = this.aClass20_21.aClass526Array200[(this.anInt19 += -731541547) * 1943875965 - 1].aClass526_7157;
         } while(var1 == this.aClass20_21.aClass526Array200[this.anInt19 * 1943875965 - 1]);

         this.aClass526_20 = var1.aClass526_7157;
         this.aClass526_22 = var1;
         return var1;
      }
   }

   public Class3(Class20 var1) {
      this.aClass20_21 = var1;
      this.method529(-1095538760);
   }

   public void remove() {
      if(null == this.aClass526_22) {
         throw new IllegalStateException();
      } else {
         this.aClass526_22.method6332(-1949449864);
         this.aClass526_22 = null;
      }
   }

   public Object method524() {
      Class526 var1;
      if(this.aClass526_20 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
         var1 = this.aClass526_20;
         this.aClass526_20 = var1.aClass526_7157;
         this.aClass526_22 = var1;
         return var1;
      } else {
         do {
            if(1943875965 * this.anInt19 >= -2110864949 * this.aClass20_21.anInt198) {
               return null;
            }

            var1 = this.aClass20_21.aClass526Array200[(this.anInt19 += -731541547) * 1943875965 - 1].aClass526_7157;
         } while(var1 == this.aClass20_21.aClass526Array200[this.anInt19 * 1943875965 - 1]);

         this.aClass526_20 = var1.aClass526_7157;
         this.aClass526_22 = var1;
         return var1;
      }
   }

   public void method525() {
      if(null == this.aClass526_22) {
         throw new IllegalStateException();
      } else {
         this.aClass526_22.method6332(-1949449864);
         this.aClass526_22 = null;
      }
   }

   public void method526() {
      if(null == this.aClass526_22) {
         throw new IllegalStateException();
      } else {
         this.aClass526_22.method6332(-1949449864);
         this.aClass526_22 = null;
      }
   }

   public void method527() {
      if(null == this.aClass526_22) {
         throw new IllegalStateException();
      } else {
         this.aClass526_22.method6332(-1949449864);
         this.aClass526_22 = null;
      }
   }

   public void method528() {
      if(null == this.aClass526_22) {
         throw new IllegalStateException();
      } else {
         this.aClass526_22.method6332(-1949449864);
         this.aClass526_22 = null;
      }
   }

   void method529(int var1) {
      this.aClass526_20 = this.aClass20_21.aClass526Array200[0].aClass526_7157;
      this.anInt19 = -731541547;
      this.aClass526_22 = null;
   }

   public Object method530() {
      Class526 var1;
      if(this.aClass526_20 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
         var1 = this.aClass526_20;
         this.aClass526_20 = var1.aClass526_7157;
         this.aClass526_22 = var1;
         return var1;
      } else {
         do {
            if(1943875965 * this.anInt19 >= -2110864949 * this.aClass20_21.anInt198) {
               return null;
            }

            var1 = this.aClass20_21.aClass526Array200[(this.anInt19 += -731541547) * 1943875965 - 1].aClass526_7157;
         } while(var1 == this.aClass20_21.aClass526Array200[this.anInt19 * 1943875965 - 1]);

         this.aClass526_20 = var1.aClass526_7157;
         this.aClass526_22 = var1;
         return var1;
      }
   }

   public Class526 method531() {
      this.method529(938057827);
      return (Class526)this.next();
   }

   public boolean method532() {
      if(this.aClass526_20 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
         return true;
      } else {
         while(this.anInt19 * 1943875965 < this.aClass20_21.anInt198 * -2110864949) {
            if(this.aClass20_21.aClass526Array200[(this.anInt19 += -731541547) * 1943875965 - 1].aClass526_7157 != this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1]) {
               this.aClass526_20 = this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1].aClass526_7157;
               return true;
            }

            this.aClass526_20 = this.aClass20_21.aClass526Array200[1943875965 * this.anInt19 - 1];
         }

         return false;
      }
   }

   void method533() {
      this.aClass526_20 = this.aClass20_21.aClass526Array200[0].aClass526_7157;
      this.anInt19 = -731541547;
      this.aClass526_22 = null;
   }

   public Class526 method534() {
      this.method529(123890876);
      return (Class526)this.next();
   }

   public Class526 method535() {
      this.method529(-1343569185);
      return (Class526)this.next();
   }

   public static void method536(int var0) {
      for(Class526_Sub21_Sub7 var1 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8143((byte)-1); null != var1; var1 = (Class526_Sub21_Sub7)Class31.aClass696_287.method8139(68831625)) {
         if(-1095890769 * var1.anInt11664 > 1) {
            var1.anInt11664 = 0;
            Class31.aClass192_280.method2768(var1, -3207281156750170469L * ((Class526_Sub21_Sub6)var1.aClass696_11662.aClass526_Sub21_8758.aClass526_Sub21_10531).aLong11658);
            var1.aClass696_11662.method8135((byte)-110);
         }
      }

      Class31.anInt274 = 0;
      Class31.anInt273 = 0;
      Class31.aClass702_292.method8188(-2076976308);
      Class31.aClass20_276.method647(929030154);
      Class31.aClass696_287.method8135((byte)-98);
      Class31.aBool291 = false;
   }
}
