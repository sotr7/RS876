package com.jagex;

import com.jagex.Class1;
import com.jagex.Class124_Sub1;
import com.jagex.Class144;
import com.jagex.Class166;
import com.jagex.Class174_Sub2;
import com.jagex.Class692;

public class Class124_Sub1_Sub1 extends Class124_Sub1 {
   int anInt11359;
   int anInt11358;
   float aFloat11357;
   float aFloat11361;
   boolean aBool11360;
   boolean aBool11362;

   static Class124_Sub1_Sub1 method10441(Class174_Sub2 var0, int var1, int var2, int var3, int var4) {
      return !var0.aBool9624 && (!Class1.method517(var3, 624419081) || !Class1.method517(var4, 766643022))?(var0.aBool9623?new Class124_Sub1_Sub1(var0, '\u84f5', var1, var2, var3, var4, true):new Class124_Sub1_Sub1(var0, var1, var2, var3, var4, Class692.method8110(var3, -1288056727), Class692.method8110(var4, -685533739), true)):new Class124_Sub1_Sub1(var0, 3553, var1, var2, var3, var4, true);
   }

   static Class124_Sub1_Sub1 method10442(Class174_Sub2 var0, int var1, int var2, boolean var3, int[] var4, int var5, int var6) {
      return !var0.aBool9624 && (!Class1.method517(var1, -407913045) || !Class1.method517(var2, 89985075))?(var0.aBool9623?new Class124_Sub1_Sub1(var0, '\u84f5', var1, var2, var3, var4, var5, var6):new Class124_Sub1_Sub1(var0, var1, var2, Class692.method8110(var1, -1951017661), Class692.method8110(var2, -1580987794), var4)):new Class124_Sub1_Sub1(var0, 3553, var1, var2, var3, var4, var5, var6);
   }

   static Class124_Sub1_Sub1 method10443(Class174_Sub2 var0, Class144 var1, Class166 var2, int var3, int var4, boolean var5, byte[] var6, Class144 var7) {
      return !var0.aBool9624 && (!Class1.method517(var3, 288231201) || !Class1.method517(var4, -1698247382))?(var0.aBool9623?new Class124_Sub1_Sub1(var0, '\u84f5', var1, var2, var3, var4, var5, var6, var7):new Class124_Sub1_Sub1(var0, var1, var2, var3, var4, Class692.method8110(var3, 231531472), Class692.method8110(var4, -749608706), var6, var7)):new Class124_Sub1_Sub1(var0, 3553, var1, var2, var3, var4, var5, var6, var7);
   }

   static Class124_Sub1_Sub1 method10444(Class174_Sub2 var0, Class144 var1, Class166 var2, int var3, int var4) {
      return !var0.aBool9624 && (!Class1.method517(var3, 1021574186) || !Class1.method517(var4, -1468047846))?(var0.aBool9623?new Class124_Sub1_Sub1(var0, '\u84f5', var1, var2, var3, var4):new Class124_Sub1_Sub1(var0, var1, var2, var3, var4, Class692.method8110(var3, -21514859), Class692.method8110(var4, 1290686478))):new Class124_Sub1_Sub1(var0, 3553, var1, var2, var3, var4);
   }

   void method1486(boolean var1) {
      super.method1475(var1 && !this.aBool11362);
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, int var2, int var3, int var4, boolean var5, int[] var6, int var7, int var8) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, true);
      this.anInt11359 = var3;
      this.anInt11358 = var4;
      if(this.anInt1587 == '\u84f5') {
         this.aFloat11357 = (float)var4;
         this.aFloat11361 = (float)var3;
         this.aBool11360 = false;
      } else {
         this.aFloat11357 = 1.0F;
         this.aFloat11361 = 1.0F;
         this.aBool11360 = true;
      }

      this.aBool11362 = false;
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, int var6, boolean var7, byte[] var8, Class144 var9) {
      super(var1, var2, var3, var4, var5, var6, var7, var8, var9, true);
      this.anInt11359 = var5;
      this.anInt11358 = var6;
      if(this.anInt1587 == '\u84f5') {
         this.aFloat11357 = (float)var6;
         this.aFloat11361 = (float)var5;
         this.aBool11360 = false;
      } else {
         this.aFloat11357 = 1.0F;
         this.aFloat11361 = 1.0F;
         this.aBool11360 = true;
      }

      this.aBool11362 = false;
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5, int var6, int var7) {
      super(var1, 3553, var2, var3, var6, var7);
      this.anInt11359 = var4;
      this.anInt11358 = var5;
      this.aFloat11357 = (float)var5 / (float)var7;
      this.aFloat11361 = (float)var4 / (float)var6;
      this.aBool11360 = false;
      this.aBool11362 = true;
      this.method8335(false, false);
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, int var2, int var3, int var4, int var5, int[] var6) {
      super(var1, 3553, Class144.aClass144_1680, Class166.aClass166_1884, var4, var5);
      this.anInt11359 = var2;
      this.anInt11358 = var3;
      this.method8337(0, var5 - var3, var2, var3, var6, 0, 0, true);
      this.aFloat11357 = (float)var3 / (float)var5;
      this.aFloat11361 = (float)var2 / (float)var4;
      this.aBool11360 = false;
      this.aBool11362 = true;
      this.method8335(false, false);
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, Class144 var2, Class166 var3, int var4, int var5, int var6, int var7, byte[] var8, Class144 var9) {
      super(var1, 3553, var2, var3, var6, var7);
      this.anInt11359 = var4;
      this.anInt11358 = var5;
      this.method8336(0, var7 - var5, var4, var5, var8, var9, 0, 0, true);
      this.aFloat11357 = (float)var5 / (float)var7;
      this.aFloat11361 = (float)var4 / (float)var6;
      this.aBool11360 = false;
      this.aBool11362 = true;
      this.method8335(false, false);
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, int var2, int var3, int var4, int var5, int var6, int var7, boolean var8) {
      super(var1, 3553, var2, var3, var6, var7);
      this.anInt11359 = var4;
      this.anInt11358 = var5;
      this.aFloat11357 = (float)var5 / (float)var7;
      this.aFloat11361 = (float)var4 / (float)var6;
      this.aBool11360 = false;
      this.aBool11362 = true;
      this.method8335(false, false);
   }

   void method1489(boolean var1) {
      super.method1475(var1 && !this.aBool11362);
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, int var2, Class144 var3, Class166 var4, int var5, int var6) {
      super(var1, var2, var3, var4, var5, var6);
      this.anInt11359 = var5;
      this.anInt11358 = var6;
      if(this.anInt1587 == '\u84f5') {
         this.aFloat11357 = (float)var6;
         this.aFloat11361 = (float)var5;
         this.aBool11360 = false;
      } else {
         this.aFloat11357 = 1.0F;
         this.aFloat11361 = 1.0F;
         this.aBool11360 = true;
      }

      this.aBool11362 = false;
   }

   void method1475(boolean var1) {
      super.method1475(var1 && !this.aBool11362);
   }

   Class124_Sub1_Sub1(Class174_Sub2 var1, int var2, int var3, int var4, int var5, int var6, boolean var7) {
      super(var1, var2, var3, var4, var5, var6);
      this.anInt11359 = var5;
      this.anInt11358 = var6;
      if(this.anInt1587 == '\u84f5') {
         this.aFloat11357 = (float)var6;
         this.aFloat11361 = (float)var5;
         this.aBool11360 = false;
      } else {
         this.aFloat11357 = 1.0F;
         this.aFloat11361 = 1.0F;
         this.aBool11360 = true;
      }

      this.aBool11362 = false;
   }
}
