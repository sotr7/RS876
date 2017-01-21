package com.jagex;

import com.jagex.Class221;
import com.jagex.Class225;
import com.jagex.Class24;
import com.jagex.InterfaceDef;
import com.jagex.Class296;
import com.jagex.Class315_Sub1;
import com.jagex.Class380;
import com.jagex.Class380_Sub1;
import com.jagex.Class454;
import com.jagex.Class465;
import com.jagex.RSByteBuffer;
import com.jagex.Class681;

public class Class243 {
   public InterfaceDef[] aClass245Array2459;
   public boolean aBool2458;
   InterfaceDef[] aClass245Array2457;

   public InterfaceDef[] method3330(byte var1) {
      return this.aClass245Array2457 == null?this.aClass245Array2459:this.aClass245Array2457;
   }

   public InterfaceDef method3331(int var1, int var2) {
      if(this.aClass245Array2459[0].uid * 919258769 >>> 16 != var1 >>> 16) {
         throw new IllegalArgumentException();
      } else {
         return this.aClass245Array2459[var1 & '\uffff'];
      }
   }

   Class243(boolean var1, InterfaceDef[] var2) {
      this.aClass245Array2459 = var2;
      this.aBool2458 = var1;
   }

   public InterfaceDef[] method3332(byte var1) {
      if(this.aClass245Array2457 == null) {
         int var2 = this.aClass245Array2459.length;
         this.aClass245Array2457 = new InterfaceDef[var2];
         System.arraycopy(this.aClass245Array2459, 0, this.aClass245Array2457, 0, this.aClass245Array2459.length);
      }

      return this.aClass245Array2457;
   }

   static final void method3333(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      String var3 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      if(var2 == -1) {
         throw new RuntimeException();
      } else {
         Class24 var4 = (Class24)Class465.aClass40_Sub17_5321.method89(var2, -12030932);
         if(Class454.aClass454_4997 != var4.aClass454_234) {
            throw new RuntimeException();
         } else {
            var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var4.method701(var3, (short)5890)?1:0;
         }
      }
   }

   public static Class380 method3334(RSByteBuffer var0, int var1) {
      Class380 var2 = Class225.method3157(var0, -1361309039);
      int var3 = var0.readInt((byte)5);
      int var4 = var0.readInt((byte)5);
      return new Class380_Sub1(var2.aClass384_3932, var2.aClass389_3929, var2.anInt3930 * 1035562863, var2.anInt3931 * 26479163, -219376461 * var2.anInt3936, 874500417 * var2.anInt3933, var2.anInt3934 * -1403557073, 2079046623 * var2.anInt3935, 252950473 * var2.anInt3928, var3, var4);
   }

   static final void method3335(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)6);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class296.method3965(var3, var4, var0, 1887863720);
   }
}
