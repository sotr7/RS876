package com.jagex;

import com.jagex.Class144;
import com.jagex.Class149;
import com.jagex.Class177;
import com.jagex.Class192;
import com.jagex.Class229;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class26;
import com.jagex.Class27;
import com.jagex.Class409;
import com.jagex.Class415;
import com.jagex.Class466;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class615;
import com.jagex.Class674;
import com.jagex.Class681;
import com.jagex.Class703;

public abstract class Class568 {
   static Class703 aClass703_7616;
   Class192 aClass192_7614 = new Class192(20);
   Class466 aClass466_7615;

   void method6822() {
      Class192 var1 = this.aClass192_7614;
      synchronized(var1) {
         this.aClass192_7614.method2772(868722953);
      }
   }

   void method6823() {
      Class192 var1 = this.aClass192_7614;
      synchronized(var1) {
         this.aClass192_7614.method2770(1783930521);
      }
   }

   void method6824(int var1, int var2) {
      Class192 var3 = this.aClass192_7614;
      synchronized(var3) {
         this.aClass192_7614.method2769(var1, (byte)-27);
      }
   }

   void method6825(int var1) {
      Class192 var2 = this.aClass192_7614;
      synchronized(var2) {
         this.aClass192_7614.method2772(1863908980);
      }
   }

   void method6826() {
      Class192 var1 = this.aClass192_7614;
      synchronized(var1) {
         this.aClass192_7614.method2770(2063450391);
      }
   }

   void method6827(int var1) {
      Class192 var2 = this.aClass192_7614;
      synchronized(var2) {
         this.aClass192_7614.method2770(537147084);
      }
   }

   void method6828() {
      Class192 var1 = this.aClass192_7614;
      synchronized(var1) {
         this.aClass192_7614.method2770(763173626);
      }
   }

   void method6829(int var1) {
      Class192 var2 = this.aClass192_7614;
      synchronized(var2) {
         this.aClass192_7614.method2769(var1, (byte)-38);
      }
   }

   Class568(Class466 var1) {
      this.aClass466_7615 = var1;
   }

   void method6830() {
      Class192 var1 = this.aClass192_7614;
      synchronized(var1) {
         this.aClass192_7614.method2772(111709081);
      }
   }

   static final void method6831(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      String var4 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(99 == var2) {
         Class27.method722(var4, -315839031);
      } else if(98 == var2) {
         Class144.method1668(var4, -2085844286);
      } else {
         Class177.method2659(var2, var3, "", "", "", var4, (Class415)null, -360013055);
      }

   }

   static final void method6832(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      Class570.aClass231_7657.method3198(var2, var3, -547317405);
   }

   static final void method6833(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class409.method4896(var2, false, (byte)-11);
   }

   static final void method6834(Class681 var0, int var1) {
      var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = Class674.method8008(Class229.method3177(var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285], 1055180086), Class26.aClass673_247.getId(), -691460845);
   }

   static final void method6835(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub33_10608.method10134((byte)113) && Class554.aClass174_7475.method2242()?1:0;
   }

   public static int method6836(int var0, int var1) {
      int var2 = var0 >>> 1;
      var2 |= var2 >>> 1;
      var2 |= var2 >>> 2;
      var2 |= var2 >>> 4;
      var2 |= var2 >>> 8;
      var2 |= var2 >>> 16;
      return var0 & ~var2;
   }

   static final void method6837(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2630 = Class615.method7280(var4, var2, -1882721696);
      var0.aBool2560 = true;
   }
}
