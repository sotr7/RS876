package com.jagex;

import com.jagex.Class466;
import com.jagex.Class479;
import com.jagex.Class493;
import com.jagex.Class526_Sub21_Sub19;
import com.jagex.RSByteBuffer;
import com.jagex.RenderDef;
import com.jagex.Class581;
import com.jagex.Class653;
import com.jagex.Class681;
import com.jagex.twitchtv.TwitchEvent;

public class Class480 {
   public static Class466 aClass466_5455;
   int anInt5452;
   int anInt5453;
   // $FF: synthetic field
   Class479 this$0;
   RSByteBuffer aClass526_Sub36_5454;
   boolean aBool5451;

   void method5751(int var1) {
      if(null != this.aClass526_Sub36_5454 && !this.aBool5451) {
         this.aClass526_Sub36_5454.method9675(342027880);
      }

      this.anInt5452 = -478557991;
      this.anInt5453 = 1459358351;
   }

   Class480(Class479 var1, RSByteBuffer var2, boolean var3) {
      this.this$0 = var1;
      this.aClass526_Sub36_5454 = var2;
      this.aBool5451 = var3;
      this.anInt5452 = -478557991;
      this.anInt5453 = 1459358351;
   }

   void method5752() {
      if(null != this.aClass526_Sub36_5454 && !this.aBool5451) {
         this.aClass526_Sub36_5454.method9675(-726336789);
      }

      this.anInt5452 = -478557991;
      this.anInt5453 = 1459358351;
   }

   void method5753() {
      if(null != this.aClass526_Sub36_5454 && !this.aBool5451) {
         this.aClass526_Sub36_5454.method9675(-744299679);
      }

      this.anInt5452 = -478557991;
      this.anInt5453 = 1459358351;
   }

   public static void method5754(int var0, TwitchEvent var1, int var2) {
      Class526_Sub21_Sub19 var3 = Class493.method5892(Class581.aClass581_7752, var0, -1, -1372708441);
      if(null != var3) {
         Class681 var4 = RenderDef.method6932((byte)-103);
         if(0 != -1134111333 * var3.anInt11864) {
            var4.aLongArray8619 = new long[-1134111333 * var3.anInt11864];
         }

         if(-2142922607 * var3.anInt11865 != 0) {
            var4.anIntArray8643 = new int[var3.anInt11865 * -2142922607];
         }

         if(-790376653 * var3.anInt11869 != 0) {
            var4.anObjectArray8618 = new String[-790376653 * var3.anInt11869];
         }

         var1.method4882(var4.anIntArray8643, var4.aLongArray8619, var4.anObjectArray8618);
         Class653.method7792(var3, 500000, var4, (byte)-9);
      }
   }
}
