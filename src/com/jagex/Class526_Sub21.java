package com.jagex;

import com.jagex.Class526;
import com.jagex.Class526_Sub32;
import com.jagex.Class561;
import com.jagex.Class639_Sub1_Sub2_Sub1;
import com.jagex.Class681;
import com.jagex.MovementDirection;
import com.jagex.Class8;

public class Class526_Sub21 extends Class526 {
   public long cachedKey;
   public Class526_Sub21 aClass526_Sub21_10531;
   public Class526_Sub21 aClass526_Sub21_10532;

   public void method9440() {
      if(null != this.aClass526_Sub21_10532) {
         this.aClass526_Sub21_10532.aClass526_Sub21_10531 = this.aClass526_Sub21_10531;
         this.aClass526_Sub21_10531.aClass526_Sub21_10532 = this.aClass526_Sub21_10532;
         this.aClass526_Sub21_10531 = null;
         this.aClass526_Sub21_10532 = null;
      }
   }

   public void uncache(int var1) {
      if(null != this.aClass526_Sub21_10532) {
         this.aClass526_Sub21_10532.aClass526_Sub21_10531 = this.aClass526_Sub21_10531;
         this.aClass526_Sub21_10531.aClass526_Sub21_10532 = this.aClass526_Sub21_10532;
         this.aClass526_Sub21_10531 = null;
         this.aClass526_Sub21_10532 = null;
      }
   }

   public void method9442() {
      if(null != this.aClass526_Sub21_10532) {
         this.aClass526_Sub21_10532.aClass526_Sub21_10531 = this.aClass526_Sub21_10531;
         this.aClass526_Sub21_10531.aClass526_Sub21_10532 = this.aClass526_Sub21_10532;
         this.aClass526_Sub21_10531 = null;
         this.aClass526_Sub21_10532 = null;
      }
   }

   public void method9443() {
      if(null != this.aClass526_Sub21_10532) {
         this.aClass526_Sub21_10532.aClass526_Sub21_10531 = this.aClass526_Sub21_10531;
         this.aClass526_Sub21_10531.aClass526_Sub21_10532 = this.aClass526_Sub21_10532;
         this.aClass526_Sub21_10531 = null;
         this.aClass526_Sub21_10532 = null;
      }
   }

   static final void method9444(Class681 var0, short var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class8.aClass547_45.method6523(-860614987)?1:0;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class8.aClass547_45.method6547(1305328919)?1:0;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class8.aClass547_45.method6525(-790962616)?1:0;
   }

   public static Class526_Sub32 method9445(int var0, boolean var1, int var2) {
      Class526_Sub32[] var3 = Class526_Sub32.aClass526_Sub32Array10595;
      synchronized(var3) {
         if(-47844285 * Class526_Sub32.anInt10596 == 0) {
            return new Class526_Sub32(var0, var1);
         } else {
            Class526_Sub32.aClass526_Sub32Array10595[(Class526_Sub32.anInt10596 -= 1247213675) * -47844285].method9587(var0, var1, (byte)1);
            return Class526_Sub32.aClass526_Sub32Array10595[Class526_Sub32.anInt10596 * -47844285];
         }
      }
   }

   static void method9446(Class639_Sub1_Sub2_Sub1 var0, int var1, int var2) {
      if(var0.anIntArray11935 != null) {
         MovementDirection var3 = (MovementDirection)Class561.findIdentifiable(MovementDirection.method8035(40790809), var1, (byte)-20);
         int var4 = var0.anIntArray11935[var3.method8036((byte)-10)];
         if(var4 != var0.aClass704_11915.method8220(-2063370465)) {
            var0.aClass704_11915.method8222(var4, var0.aClass704_11915.method8228((byte)111), 878739081);
            var0.anInt11948 = 1113320973 * var0.anInt11943;
         }
      }

   }
}
