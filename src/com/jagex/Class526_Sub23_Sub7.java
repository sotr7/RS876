package com.jagex;

import com.jagex.Class265;
import com.jagex.Class342;
import com.jagex.Class348;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub23;
import com.jagex.RSByteBuffer;

public class Class526_Sub23_Sub7 extends Class526_Sub23 {
   int anInt11636;
   long aLong11637;
   // $FF: synthetic field
   Class342 this$0;

   void method9453(RSByteBuffer var1) {
      this.anInt11636 = var1.readInt((byte)5) * 1474737923;
      this.aLong11637 = var1.method9663(1387226404) * 6667864460676312813L;
   }

   void method9451(RSByteBuffer var1, int var2) {
      this.anInt11636 = var1.readInt((byte)5) * 1474737923;
      this.aLong11637 = var1.method9663(1332749018) * 6667864460676312813L;
   }

   void method9450(Class348 var1, byte var2) {
      var1.method4511(this.anInt11636 * 239922091, 7646994822998744805L * this.aLong11637);
   }

   Class526_Sub23_Sub7(Class342 var1) {
      this.this$0 = var1;
   }

   void method9454(RSByteBuffer var1) {
      this.anInt11636 = var1.readInt((byte)5) * 1474737923;
      this.aLong11637 = var1.method9663(1166340895) * 6667864460676312813L;
   }

   void method9455(RSByteBuffer var1) {
      this.anInt11636 = var1.readInt((byte)5) * 1474737923;
      this.aLong11637 = var1.method9663(931340171) * 6667864460676312813L;
   }

   void method9452(RSByteBuffer var1) {
      this.anInt11636 = var1.readInt((byte)5) * 1474737923;
      this.aLong11637 = var1.method9663(852268306) * 6667864460676312813L;
   }

   void method9456(RSByteBuffer var1) {
      this.anInt11636 = var1.readInt((byte)5) * 1474737923;
      this.aLong11637 = var1.method9663(522868992) * 6667864460676312813L;
   }

   void method9457(Class348 var1) {
      var1.method4511(this.anInt11636 * 239922091, 7646994822998744805L * this.aLong11637);
   }

   static void method10564(int var0, boolean var1, short var2) {
      Class526_Sub21_Sub9 var3 = Class265.method3560(23, (long)var0);
      var3.method10584(230428369);
      var3.anInt11678 = 1693201951 * (var1?1:0);
   }
}
