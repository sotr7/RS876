package com.jagex;

import com.jagex.Class11;
import com.jagex.Class143_Sub2;
import com.jagex.Class19;
import com.jagex.Class199_Sub18;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class33;
import com.jagex.Class502;
import com.jagex.RSByteBuffer;
import com.jagex.Class655;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Class97_Sub1_Sub2;
import com.jagex.client;
import java.util.Iterator;

class Class630 implements Iterator {
   public static int anInt8218;
   int anInt8217;
   // $FF: synthetic field
   Class97_Sub1_Sub2 this$0;

   public void method7469() {
      throw new UnsupportedOperationException();
   }

   public void method7470() {
      throw new UnsupportedOperationException();
   }

   public Object next() {
      int var1 = (this.anInt8217 += 231680141) * -173352379 - 1;
      Class143_Sub2 var2 = (Class143_Sub2)this.this$0.aClass192_11334.method2765((long)var1);
      return var2 != null?var2:this.this$0.method10412(var1, 1270312011);
   }

   Class630(Class97_Sub1_Sub2 var1) {
      this.this$0 = var1;
   }

   public boolean method7471() {
      return -173352379 * this.anInt8217 < this.this$0.method87(426706241);
   }

   public void method7472() {
      throw new UnsupportedOperationException();
   }

   public void method7473() {
      throw new UnsupportedOperationException();
   }

   public void remove() {
      throw new UnsupportedOperationException();
   }

   public void method7474() {
      throw new UnsupportedOperationException();
   }

   public Object method7475() {
      int var1 = (this.anInt8217 += 231680141) * -173352379 - 1;
      Class143_Sub2 var2 = (Class143_Sub2)this.this$0.aClass192_11334.method2765((long)var1);
      return var2 != null?var2:this.this$0.method10412(var1, 1270312011);
   }

   public Object method7476() {
      int var1 = (this.anInt8217 += 231680141) * -173352379 - 1;
      Class143_Sub2 var2 = (Class143_Sub2)this.this$0.aClass192_11334.method2765((long)var1);
      return var2 != null?var2:this.this$0.method10412(var1, 1270312011);
   }

   public boolean hasNext() {
      return -173352379 * this.anInt8217 < this.this$0.method87(898969059);
   }

   static final void method7477(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-45);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class199_Sub18.method9025(var3, var4, var0, 1253738905);
   }

   public static Class19 method7478(Class11 var0, RSByteBuffer var1, int var2) {
      return Class502.method6025(var0, var1, 2, -1390317801);
   }

   static final void method7479(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(null != client.aString11017 && var2 < -190820129 * Class11.anInt145) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class655.aClass107Array8488[var2].aByte1315;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method7480(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      Class679 var4 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      Class33.method812(var4.aClass245_8600, var2, var3, (short)128);
   }
}
