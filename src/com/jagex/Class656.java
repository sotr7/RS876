package com.jagex;

import com.jagex.Class143;
import com.jagex.Class205;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class31;
import com.jagex.Class311;
import com.jagex.Class315_Sub1;
import com.jagex.Class317;
import com.jagex.Class348;
import com.jagex.Class454;
import com.jagex.Class523;
import com.jagex.Class526_Sub25;
import com.jagex.Class534;
import com.jagex.Class681;
import com.jagex.Class711_Sub36;
import com.jagex.Interface18;
import com.jagex.client;

public class Class656 implements Interface18 {
   Class348 aClass348_8489;

   public int method116(Class317 var1, byte var2) {
      return var1.method4094(this.method114(var1.aClass143_3405, 1101370823), -1434583520);
   }

   public int method114(Class143 var1, int var2) {
      Integer var3 = this.aClass348_8489.method4519(client.aClass676_11127.anInt8593 * -767001605 << 16 | 697078941 * var1.anInt1674, 1329991784);
      return var3 == null?((Integer)var1.method1661(2143840981)).intValue():var3.intValue();
   }

   public long method121(Class143 var1, int var2) {
      Long var3 = this.aClass348_8489.method4488(client.aClass676_11127.anInt8593 * -767001605 << 16 | 697078941 * var1.anInt1674, (byte)10);
      return null == var3?((Long)var1.method1661(-302379944)).longValue():var3.longValue();
   }

   public Object method113(Class143 var1, byte var2) {
      if(Class454.aClass454_4997 != var1.aClass454_1676) {
         throw new IllegalArgumentException("");
      } else {
         return this.aClass348_8489.method4520(client.aClass676_11127.anInt8593 * -767001605 << 16 | 697078941 * var1.anInt1674, 1621208931);
      }
   }

   public int method120(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, 28177888), -1434583520);
   }

   public int method117(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, -176395572), -1434583520);
   }

   public int method118(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, -628630196), -1434583520);
   }

   public void method115(Class143 var1, Object var2, byte var3) {
      throw new UnsupportedOperationException();
   }

   public void method129(Class317 var1, int var2, int var3) {
      throw new UnsupportedOperationException();
   }

   public void method123(Class143 var1, int var2) {
      throw new UnsupportedOperationException();
   }

   public Object method126(Class143 var1) {
      if(Class454.aClass454_4997 != var1.aClass454_1676) {
         throw new IllegalArgumentException("");
      } else {
         return this.aClass348_8489.method4520(client.aClass676_11127.anInt8593 * -767001605 << 16 | 697078941 * var1.anInt1674, -1467916459);
      }
   }

   public void method110(Class143 var1, long var2) {
      throw new UnsupportedOperationException();
   }

   public void method111(Class143 var1, int var2, byte var3) {
      throw new UnsupportedOperationException();
   }

   public int method122(Class143 var1) {
      Integer var2 = this.aClass348_8489.method4519(client.aClass676_11127.anInt8593 * -767001605 << 16 | 697078941 * var1.anInt1674, -256676390);
      return var2 == null?((Integer)var1.method1661(1444898927)).intValue():var2.intValue();
   }

   public int method119(Class317 var1) {
      return var1.method4094(this.method114(var1.aClass143_3405, -998341692), -1434583520);
   }

   public long method124(Class143 var1) {
      Long var2 = this.aClass348_8489.method4488(client.aClass676_11127.anInt8593 * -767001605 << 16 | 697078941 * var1.anInt1674, (byte)32);
      return null == var2?((Long)var1.method1661(1875708761)).longValue():var2.longValue();
   }

   public void method125(Class143 var1, long var2) {
      throw new UnsupportedOperationException();
   }

   Class656(Class348 var1) {
      this.aClass348_8489 = var1;
   }

   public void method127(Class143 var1, Object var2) {
      throw new UnsupportedOperationException();
   }

   public void method128(Class317 var1, int var2) {
      throw new UnsupportedOperationException();
   }

   public void method112(Class317 var1, int var2) {
      throw new UnsupportedOperationException();
   }

   static final void method7834(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)43);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class534.method6400(var3, var4, var0, 1582277363);
   }

   static final void method7835(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)79);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3.anInt2546 * -1546678639;
   }

   static final void method7836(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.anInt3631 * -1488926957;
   }

   static void method7837(int var0) {
      if(Class31.aClass526_Sub21_Sub7_267 != null) {
         Class31.aClass526_Sub21_Sub7_267 = null;
         Class205.method2895(Class711_Sub36.anInt10917 * -679993307, 660573447 * Class311.anInt3384, Class526_Sub25.anInt10551 * -1423746299, Class523.anInt7075 * 568451999, -1155490381);
      }
   }
}
