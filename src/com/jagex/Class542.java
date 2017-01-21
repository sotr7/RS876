package com.jagex;

import com.jagex.Class113;
import com.jagex.Class207;
import com.jagex.Class227;
import com.jagex.Class230;
import com.jagex.Class238;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class273;
import com.jagex.Class324;
import com.jagex.Class331;
import com.jagex.Class466;
import com.jagex.Class523;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.Class526_Sub31;
import com.jagex.Class537;
import com.jagex.Class547;
import com.jagex.Class547_Sub1;
import com.jagex.Class554;
import com.jagex.RenderDef;
import com.jagex.Class645;
import com.jagex.Class679;
import com.jagex.Class681;
import java.awt.Component;
import java.io.IOException;

public class Class542 {
   static Class466 aClass466_7239;
   int anInt7235;
   // $FF: synthetic field
   Class523 this$0;
   short[] aShortArray7238;
   Class331[] aClass331Array7236;
   Class331[] aClass331Array7237;
   Class331 aClass331_7234;

   void method6479(int var1) {
      Class207.method2922(this.aShortArray7238, (byte)0);

      for(int var2 = 0; var2 < -1174176487 * this.anInt7235; ++var2) {
         this.aClass331Array7236[var2].method4246(96993686);
         this.aClass331Array7237[var2].method4246(294645708);
      }

      this.aClass331_7234.method4246(1349644446);
   }

   void method6480(int var1, int var2) {
      while(-1174176487 * this.anInt7235 < var1) {
         this.aClass331Array7236[this.anInt7235 * -1174176487] = new Class331(3);
         this.aClass331Array7237[this.anInt7235 * -1174176487] = new Class331(3);
         this.anInt7235 += 420515625;
      }

   }

   int method6481(Class324 var1, int var2, int var3) throws IOException {
      if(var1.method4162(this.aShortArray7238, 0, -2114435951) == 0) {
         return this.aClass331Array7236[var2].method4244(var1, (byte)60);
      } else {
         byte var4 = 8;
         int var5;
         if(var1.method4162(this.aShortArray7238, 1, -2114435951) == 0) {
            var5 = var4 + this.aClass331Array7237[var2].method4244(var1, (byte)82);
         } else {
            var5 = var4 + 8 + this.aClass331_7234.method4244(var1, (byte)23);
         }

         return var5;
      }
   }

   void method6482() {
      Class207.method2922(this.aShortArray7238, (byte)0);

      for(int var1 = 0; var1 < -1174176487 * this.anInt7235; ++var1) {
         this.aClass331Array7236[var1].method4246(1338688906);
         this.aClass331Array7237[var1].method4246(597243333);
      }

      this.aClass331_7234.method4246(1070810356);
   }

   void method6483() {
      Class207.method2922(this.aShortArray7238, (byte)0);

      for(int var1 = 0; var1 < -1174176487 * this.anInt7235; ++var1) {
         this.aClass331Array7236[var1].method4246(76734553);
         this.aClass331Array7237[var1].method4246(2025493462);
      }

      this.aClass331_7234.method4246(1560716925);
   }

   Class542(Class523 var1) {
      this.this$0 = var1;
      this.aShortArray7238 = new short[2];
      this.aClass331Array7236 = new Class331[16];
      this.aClass331Array7237 = new Class331[16];
      this.aClass331_7234 = new Class331(8);
      this.anInt7235 = 0;
   }

   public static Class547 method6484(Component var0, boolean var1, int var2) {
      return new Class547_Sub1(var0, var1);
   }

   static Class526_Sub21_Sub19 method6485(int var0, int var1) {
      Class526_Sub21_Sub19 var2 = (Class526_Sub21_Sub19)Class645.aClass195_8444.method2816((long)var0);
      if(null != var2) {
         return var2;
      } else {
         byte[] var3 = Class526_Sub21_Sub2.aClass466_11339.method5536(var0, 0, (byte)32);
         if(var3 != null && var3.length > 1) {
            try {
               var2 = Class273.method3611(var3, (byte)46);
            } catch (Exception var5) {
               throw new RuntimeException(var5.getMessage() + " " + var0);
            }

            Class645.aClass195_8444.method2817(var2, (long)var0);
            return var2;
         } else {
            return null;
         }
      }
   }

   static final void method6486(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      var0.aBool2534 = var2.anIntArray8622[(var2.anInt8623 -= -1957887669) * -1730576285] == 1;
      Class526_Sub31.method9555(var0, (byte)10);
   }

   static final void method6487(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class537.method6429(var3, var4, var0, (byte)51);
   }

   static final void method6488(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(!Class554.aClass174_7475.method2240()) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 3;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub26_10611.method8313(var2, -1060316411);
      }

   }

   static final void method6489(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      RenderDef var3 = (RenderDef)Class227.aClass40_Sub16_2327.method89(var2, -1870594354);
      if(var3.loopAnimations != null && var3.loopAnimations.length > 0) {
         int var4 = 0;
         int var5 = var3.loopAnimDurations[0];

         for(int var6 = 1; var6 < var3.loopAnimations.length; ++var6) {
            if(var3.loopAnimDurations[var6] > var5) {
               var4 = var6;
               var5 = var3.loopAnimDurations[var6];
            }
         }

         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.loopAnimations[var4];
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -169294459 * var3.standAnimation;
      }

   }

   static final void method6490(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class238 var3 = (Class238)Class113.aClass40_Sub6_1371.method89(var2, 177965270);
      if(null == var3.aString2398) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = "";
      } else {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = var3.aString2398;
      }

   }
}
