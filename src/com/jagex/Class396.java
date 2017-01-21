package com.jagex;

import com.jagex.Class188;
import com.jagex.Class192;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class391;
import com.jagex.Class42;
import com.jagex.Class461;
import com.jagex.Class466;
import com.jagex.Class484;
import com.jagex.Class526_Sub31;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface46;

public class Class396 implements Interface46 {
   Class192 aClass192_4114 = new Class192(64);
   Class466 aClass466_4115;

   public Class396(Class466 var1) {
      this.aClass466_4115 = var1;
   }

   public Class391 method350(int var1, int var2) {
      Class391 var3 = (Class391)this.aClass192_4114.method2765((long)var1);
      if(null != var3) {
         return var3;
      } else {
         byte[] var4 = this.aClass466_4115.method5536(1, var1, (byte)7);
         var3 = new Class391();
         var3.anInt4077 = var1 * -287987249;
         if(var4 != null) {
            var3.method4779(new RSByteBuffer(var4), -1382016201);
         }

         var3.method4780(-504353496);
         this.aClass192_4114.method2768(var3, (long)var1);
         return var3;
      }
   }

   public void method4814() {
      this.aClass192_4114.method2770(961343579);
   }

   public void method4815(int var1) {
      this.aClass192_4114.method2770(1648639322);
   }

   public Class391 method349(int var1) {
      Class391 var2 = (Class391)this.aClass192_4114.method2765((long)var1);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = this.aClass466_4115.method5536(1, var1, (byte)86);
         var2 = new Class391();
         var2.anInt4077 = var1 * -287987249;
         if(var3 != null) {
            var2.method4779(new RSByteBuffer(var3), 235992517);
         }

         var2.method4780(-1338170808);
         this.aClass192_4114.method2768(var2, (long)var1);
         return var2;
      }
   }

   public Class391 method347(int var1) {
      Class391 var2 = (Class391)this.aClass192_4114.method2765((long)var1);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = this.aClass466_4115.method5536(1, var1, (byte)59);
         var2 = new Class391();
         var2.anInt4077 = var1 * -287987249;
         if(var3 != null) {
            var2.method4779(new RSByteBuffer(var3), -49729486);
         }

         var2.method4780(-1472781938);
         this.aClass192_4114.method2768(var2, (long)var1);
         return var2;
      }
   }

   public void method4816() {
      this.aClass192_4114.method2770(449369528);
   }

   public Class391 method348(int var1) {
      Class391 var2 = (Class391)this.aClass192_4114.method2765((long)var1);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = this.aClass466_4115.method5536(1, var1, (byte)-8);
         var2 = new Class391();
         var2.anInt4077 = var1 * -287987249;
         if(var3 != null) {
            var2.method4779(new RSByteBuffer(var3), -1537917962);
         }

         var2.method4780(-1505469256);
         this.aClass192_4114.method2768(var2, (long)var1);
         return var2;
      }
   }

   public void method4817() {
      this.aClass192_4114.method2770(747203047);
   }

   static final void method4818(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aBool2574 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class526_Sub31.method9555(var0, (byte)10);
      if(1300712985 * var0.componentSlot == -1 && !var1.aBool2458) {
         Class42.method899(919258769 * var0.uid, 2037241760);
      }

   }

   static final void method4819(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)61);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class484.method5835(var3, var4, var0, (byte)16);
   }

   static final void method4820(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class461.method5471(var3, var4, var0, (byte)-34);
   }

   static final void method4821(Class681 var0, int var1) {
      var0.anIntArray8643[var0.anIntArray8642[var0.anInt8644 * -244840757]] = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
   }

   static final void method4822(Class681 var0, int var1) {
      var0.anInt8625 -= -255940646;
      String var2 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629];
      String var3 = (String)var0.anObjectArray8624[var0.anInt8625 * 540934629 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class188.method2739(var2, var3, -97450807);
   }
}
