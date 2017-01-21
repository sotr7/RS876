package com.jagex;

import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class506;
import com.jagex.Class525_Sub1;
import com.jagex.Class526;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;
import com.jagex.Interface26;

public class Class252 implements Interface26 {
   // $FF: synthetic field
   Class232 this$0;
   int anInt2777;
   int anInt2776;

   public void method168(Class223 var1, byte var2) {
      var1.method3101(this.anInt2777 * 1741691009, 1005736493 * this.anInt2776, (byte)-40);
      var1.method3122(this.anInt2777 * 1741691009, (byte)43).method3002((byte)66);
   }

   public void method167(Class223 var1) {
      var1.method3101(this.anInt2777 * 1741691009, 1005736493 * this.anInt2776, (byte)-9);
      var1.method3122(this.anInt2777 * 1741691009, (byte)15).method3002((byte)93);
   }

   public void method166(Class223 var1) {
      var1.method3101(this.anInt2777 * 1741691009, 1005736493 * this.anInt2776, (byte)36);
      var1.method3122(this.anInt2777 * 1741691009, (byte)68).method3002((byte)5);
   }

   Class252(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2777 = var2.readUnsignedShort(452356401) * 141043585;
      this.anInt2776 = var2.readUnsignedShort(2033377551) * -1645228635;
   }

   public void method165(Class223 var1) {
      var1.method3101(this.anInt2777 * 1741691009, 1005736493 * this.anInt2776, (byte)-29);
      var1.method3122(this.anInt2777 * 1741691009, (byte)98).method3002((byte)84);
   }

   public void method169(Class223 var1) {
      var1.method3101(this.anInt2777 * 1741691009, 1005736493 * this.anInt2776, (byte)19);
      var1.method3122(this.anInt2777 * 1741691009, (byte)38).method3002((byte)118);
   }

   static final void method3468(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      boolean var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1] == 1;
      if(Class525_Sub1.aClass20_10725 != null) {
         Class526 var4 = Class525_Sub1.aClass20_10725.get((long)var2);
         if(null != var4 && !var3) {
            var4.method6332(-1949449864);
         } else if(null == var4 && var3) {
            var4 = new Class526();
            Class525_Sub1.aClass20_10725.put(var4, (long)var2);
         }
      }

   }

   static final void method3469(Class681 var0, byte var1) {
      Class506.method6136((byte)104);
   }
}
