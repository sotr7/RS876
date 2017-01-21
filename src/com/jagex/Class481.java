package com.jagex;

import com.jagex.Class171;
import com.jagex.Class174_Sub1;
import com.jagex.Class184_Sub1_Sub3;
import com.jagex.Class184_Sub1_Sub3_Sub1;
import com.jagex.Class235;
import com.jagex.Class394;
import com.jagex.Class476;
import com.jagex.Class477;
import com.jagex.Class483;
import com.jagex.Class484;
import com.jagex.Class488;
import com.jagex.Class526_Sub32;
import com.jagex.RSByteBuffer;
import com.jagex.Class584;
import com.jagex.Class681;
import com.jagex.Interface11;
import com.jagex.Interface76;
import java.awt.Canvas;

public class Class481 implements Interface76 {
   public int anInt5462;
   int anInt5459;
   public Class aClass5463;
   Interface11 anInterface11_5464;
   public static Class481 aClass481_5461 = new Class481(4, 0, Integer.class, new Class484());
   public static Class481 aClass481_5457 = new Class481(0, 1, Long.class, new Class476());
   public static Class481 aClass481_5458 = new Class481(2, 2, String.class, new Class483());
   static Class481 aClass481_5460 = new Class481(3, 3, Class526_Sub32.class, new Class488());
   static Class481 aClass481_5456 = new Class481(1, 4, Class235.class, new Class477());

   Class481(int var1, int var2, Class var3, Interface11 var4) {
      this.anInt5462 = var1 * -1632980349;
      this.anInt5459 = var2 * -751957539;
      this.aClass5463 = var3;
      this.anInterface11_5464 = var4;
   }

   static Class481 method5755(Class var0, byte var1) {
      Class481[] var2 = method5758((byte)48);

      for(int var3 = 0; var3 < var2.length; ++var3) {
         Class481 var4 = var2[var3];
         if(var0 == var4.aClass5463) {
            return var4;
         }
      }

      return null;
   }

   public static Interface11 method5756(Class var0, int var1) {
      Class481 var2 = method5755(var0, (byte)49);
      if(null == var2) {
         throw new IllegalArgumentException();
      } else {
         return var2.anInterface11_5464;
      }
   }

   public int getId() {
      return 1929811573 * this.anInt5459;
   }

   public Object method5757(RSByteBuffer var1, int var2) {
      return this.anInterface11_5464.method75(var1, (short)25319);
   }

   public int method21() {
      return 1929811573 * this.anInt5459;
   }

   public static Class481[] method5758(byte var0) {
      return new Class481[]{aClass481_5461, aClass481_5458, aClass481_5456, aClass481_5460, aClass481_5457};
   }

   public static Class394[] method5759(int var0) {
      return new Class394[]{Class394.aClass394_4107, Class394.aClass394_4099, Class394.aClass394_4100, Class394.aClass394_4108, Class394.aClass394_4102, Class394.aClass394_4103, Class394.aClass394_4104, Class394.aClass394_4105, Class394.aClass394_4098, Class394.aClass394_4101, Class394.aClass394_4106};
   }

   static final void method5760(Class681 var0, byte var1) {
      var0.anInt8623 -= 758383916;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      int var5 = var0.anIntArray8622[3 + -1730576285 * var0.anInt8623];
      var2 += var3 << 14;
      var2 += var4 << 28;
      var2 += var5;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
   }

   static final void method5761(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var0.aClass348_8633.anInt3640 * 1642038069;
   }

   static final void method5762(Class681 var0, int var1) {
      Class584.method6985(var0.aClass639_Sub1_Sub4_Sub1_8637, var0, (byte)14);
   }

   static final void method5763(Class681 var0, int var1) {
      if(Class171.aClass553_2016.method6666(82, 1012364234)) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static Class184_Sub1_Sub3 method5764(Class174_Sub1 var0, Canvas var1, int var2, int var3, int var4) {
      Class184_Sub1_Sub3_Sub1 var5 = new Class184_Sub1_Sub3_Sub1(var0, var1, var2, var3);
      return var5;
   }
}
