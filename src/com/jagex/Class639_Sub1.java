package com.jagex;

import com.jagex.Class164;
import com.jagex.Class174;
import com.jagex.Class230;
import com.jagex.Class526_Sub16;
import com.jagex.Class549;
import com.jagex.Class550;
import com.jagex.Class555;
import com.jagex.Class639;
import com.jagex.Class681;

public abstract class Class639_Sub1 extends Class639 {
   Class639_Sub1 aClass639_Sub1_10825;
   public byte aByte10827;
   public byte aByte10828;
   int anInt10830;
   public Class164[] aClass164Array10829;
   public Class549 aClass549_10826;

   abstract int method9817(Class526_Sub16[] var1, int var2);

   abstract boolean method9818(Class174 var1, int var2, int var3, byte var4);

   int method9819() {
      return 0;
   }

   public boolean method9820(int var1) {
      return true;
   }

   abstract boolean method9821(int var1);

   abstract boolean method9822(int var1);

   abstract void method9823(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6, int var7);

   abstract boolean method9824(Class174 var1, int var2);

   abstract Class555 method9825(Class174 var1, int var2);

   void method9826(int var1) {
      this.aClass164Array10829 = new Class164[var1];

      for(int var2 = 0; var2 < this.aClass164Array10829.length; ++var2) {
         this.aClass164Array10829[var2] = new Class164();
      }

   }

   public abstract Class550 method9827(Class174 var1, int var2);

   abstract Class555 method9828(Class174 var1);

   public abstract Class550 method9829(Class174 var1);

   abstract boolean method9830(byte var1);

   public boolean method9831() {
      return true;
   }

   public abstract int method9832(byte var1);

   public abstract int method9833();

   abstract void method9834(Class174 var1, int var2);

   void method9835(int var1, int var2) {
      this.aClass164Array10829 = new Class164[var1];

      for(int var3 = 0; var3 < this.aClass164Array10829.length; ++var3) {
         this.aClass164Array10829[var3] = new Class164();
      }

   }

   abstract boolean method9836();

   int method9837(short var1) {
      return 0;
   }

   public abstract int method9838();

   int method9839(int var1, int var2, Class526_Sub16[] var3, int var4) {
      long var5 = this.aClass549_10826.aLongArrayArrayArray7329[this.aByte10827][var1][var2];
      long var7 = 0L;

      int var9;
      int var10;
      for(var9 = 0; var7 <= 48L; var7 += 16L) {
         var10 = (int)(var5 >> (int)var7 & 65535L);
         if(var10 <= 0) {
            break;
         }

         var3[var9++] = this.aClass549_10826.aClass556Array7330[var10 - 1].aClass526_Sub16_7504;
      }

      for(var10 = var9; var10 < 4; ++var10) {
         var3[var10] = null;
      }

      return var9;
   }

   public abstract Class550 method9840(Class174 var1);

   abstract boolean method9841();

   abstract void method9842(int var1);

   public abstract Class550 method9843(Class174 var1);

   abstract Class555 method9844(Class174 var1);

   public int method9845() {
      return -this.method9832((byte)-26);
   }

   Class639_Sub1(Class549 var1) {
      this.aClass549_10826 = var1;
   }

   public int method9846() {
      return -this.method9832((byte)-52);
   }

   abstract void method9847();

   abstract void method9848(Class174 var1);

   abstract boolean method9849(Class174 var1, int var2, int var3);

   abstract boolean method9850();

   abstract boolean method9851();

   public boolean method9852() {
      return true;
   }

   abstract void method9853(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6);

   int method9854() {
      return 0;
   }

   int method9855() {
      return 0;
   }

   public abstract Class550 method9856(Class174 var1);

   int method9857() {
      return 0;
   }

   abstract Class555 method9858(Class174 var1);

   public int method9859(byte var1) {
      return -this.method9832((byte)-41);
   }

   abstract void method9860(Class174 var1, Class639_Sub1 var2, int var3, int var4, int var5, boolean var6);

   abstract int method9861(Class526_Sub16[] var1);

   abstract boolean method9862(Class174 var1);

   abstract boolean method9863(Class174 var1);

   abstract boolean method9864(byte var1);

   abstract boolean method9865(Class174 var1);

   abstract boolean method9866();

   abstract boolean method9867(Class174 var1);

   void method9868(int var1) {
      this.aClass164Array10829 = new Class164[var1];

      for(int var2 = 0; var2 < this.aClass164Array10829.length; ++var2) {
         this.aClass164Array10829[var2] = new Class164();
      }

   }

   public static final int method9869(int var0, int var1, int var2) {
      if(var0 == -1) {
         return 12345678;
      } else {
         var1 = (var0 & 127) * var1 >> 7;
         if(var1 < 2) {
            var1 = 2;
         } else if(var1 > 126) {
            var1 = 126;
         }

         return (var0 & '\uff80') + var1;
      }
   }

   public static byte[] method9870(byte[] var0, byte var1) {
      if(null == var0) {
         return null;
      } else {
         byte[] var2 = new byte[var0.length];
         System.arraycopy(var0, 0, var2, 0, var0.length);
         return var2;
      }
   }

   static final void method9871(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class230.preferences.aClass711_Sub16_10634.method8313(var2, -650096457);
   }
}
