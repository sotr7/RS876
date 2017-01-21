package com.jagex;

import com.jagex.Class124;
import com.jagex.Class126;
import com.jagex.Class126_Sub1;
import com.jagex.Class126_Sub2;
import com.jagex.Class126_Sub3;
import com.jagex.Class126_Sub4;
import com.jagex.Class126_Sub5;
import com.jagex.Class126_Sub6;
import com.jagex.Class126_Sub7;
import com.jagex.Class126_Sub8;
import com.jagex.Class126_Sub9;
import com.jagex.Class132;
import com.jagex.Class174_Sub2;

public class Class118 {
   int anInt1450 = 0;
   int anInt1451 = 0;
   int anInt1453 = 0;
   Class174_Sub2 aClass174_Sub2_1452;
   Class132 aClass132_1455;
   Class126[] aClass126Array1454;
   Class126_Sub3 aClass126_Sub3_1456;

   void method1443(int var1, int var2, int var3, boolean var4, boolean var5) {
      var5 &= this.aClass174_Sub2_1452.method8678();
      if(!var5 && (var1 == 4 || var1 == 8 || var1 == 9)) {
         if(var1 == 4) {
            var3 = var2;
         }

         var1 = 2;
      }

      if(var1 != 0 && var4) {
         var1 |= Integer.MIN_VALUE;
      }

      if(this.anInt1453 != var1) {
         if(this.anInt1453 != 0) {
            this.aClass126Array1454[this.anInt1453 & Integer.MAX_VALUE].method1508();
         }

         if(var1 != 0) {
            this.aClass126Array1454[var1 & Integer.MAX_VALUE].method1506(var4);
            this.aClass126Array1454[var1 & Integer.MAX_VALUE].method1507(var4);
            this.aClass126Array1454[var1 & Integer.MAX_VALUE].method1509(var2, var3);
         }

         this.anInt1453 = var1;
         this.anInt1450 = var2;
         this.anInt1451 = var3;
      } else if(this.anInt1453 != 0) {
         this.aClass126Array1454[this.anInt1453 & Integer.MAX_VALUE].method1507(var4);
         if(this.anInt1450 != var2 || this.anInt1451 != var3) {
            this.aClass126Array1454[this.anInt1453 & Integer.MAX_VALUE].method1509(var2, var3);
            this.anInt1450 = var2;
            this.anInt1451 = var3;
         }
      }

   }

   Class118(Class174_Sub2 var1) {
      this.aClass174_Sub2_1452 = var1;
      this.aClass132_1455 = new Class132(var1);
      this.aClass126Array1454 = new Class126[16];
      this.aClass126Array1454[1] = new Class126_Sub7(var1);
      this.aClass126Array1454[2] = new Class126_Sub9(var1, this.aClass132_1455);
      this.aClass126Array1454[4] = new Class126_Sub2(var1, this.aClass132_1455);
      this.aClass126Array1454[5] = new Class126_Sub1(var1, this.aClass132_1455);
      this.aClass126Array1454[6] = new Class126_Sub6(var1);
      this.aClass126Array1454[7] = new Class126_Sub4(var1);
      this.aClass126Array1454[3] = this.aClass126_Sub3_1456 = new Class126_Sub3(var1);
      this.aClass126Array1454[8] = new Class126_Sub5(var1, this.aClass132_1455);
      this.aClass126Array1454[9] = new Class126_Sub8(var1, this.aClass132_1455);
      if(!this.aClass126Array1454[8].method1505()) {
         this.aClass126Array1454[8] = this.aClass126Array1454[4];
      }

      if(!this.aClass126Array1454[9].method1505()) {
         this.aClass126Array1454[9] = this.aClass126Array1454[8];
      }

   }

   boolean method1444(Class124 var1, int var2) {
      if(this.anInt1453 == 0) {
         return false;
      } else {
         this.aClass126Array1454[this.anInt1453 & Integer.MAX_VALUE].method1518(var1, var2);
         return true;
      }
   }

   boolean method1445(int var1) {
      return this.aClass126Array1454[var1].method1505();
   }
}
