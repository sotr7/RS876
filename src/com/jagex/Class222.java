package com.jagex;

import com.jagex.Class220;
import com.jagex.Class223;
import com.jagex.Class232;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class278;
import com.jagex.Class526_Sub21;
import com.jagex.RSByteBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.Interface26;

public class Class222 implements Interface26 {
   public static String aString2308;
   // $FF: synthetic field
   Class232 this$0;
   int anInt2307;

   public void method168(Class223 var1, byte var2) {
      Class220 var3 = (Class220)var1.method3108(1691615210).get(this.anInt2307 * -54333441);
      var1.method3116(-54333441 * this.anInt2307, (byte)81);
      var3.method3041(-734868085);
   }

   public void method169(Class223 var1) {
      Class220 var2 = (Class220)var1.method3108(1691615210).get(this.anInt2307 * -54333441);
      var1.method3116(-54333441 * this.anInt2307, (byte)117);
      var2.method3041(-666112236);
   }

   Class222(Class232 var1, RSByteBuffer var2) {
      this.this$0 = var1;
      this.anInt2307 = var2.readUnsignedShort(1484380893) * 1648168959;
   }

   public void method167(Class223 var1) {
      Class220 var2 = (Class220)var1.method3108(1691615210).get(this.anInt2307 * -54333441);
      var1.method3116(-54333441 * this.anInt2307, (byte)117);
      var2.method3041(-1866499186);
   }

   public void method166(Class223 var1) {
      Class220 var2 = (Class220)var1.method3108(1691615210).get(this.anInt2307 * -54333441);
      var1.method3116(-54333441 * this.anInt2307, (byte)69);
      var2.method3041(-1908440582);
   }

   public void method165(Class223 var1) {
      Class220 var2 = (Class220)var1.method3108(1691615210).get(this.anInt2307 * -54333441);
      var1.method3116(-54333441 * this.anInt2307, (byte)115);
      var2.method3041(-846307650);
   }

   public static void method3096(Class526_Sub21 var0, Class526_Sub21 var1, byte var2) {
      if(var0.aClass526_Sub21_10532 != null) {
         var0.uncache(2081051156);
      }

      var0.aClass526_Sub21_10532 = var1;
      var0.aClass526_Sub21_10531 = var1.aClass526_Sub21_10531;
      var0.aClass526_Sub21_10532.aClass526_Sub21_10531 = var0;
      var0.aClass526_Sub21_10531.aClass526_Sub21_10532 = var0;
   }

   static final void method3097(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class278.method3685(var3, var4, true, 1, var0, -1119138324);
   }

   static final void method3098(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      var0.anInt8623 -= 379191958;
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2.indexOf(var3, var4);
   }
}
