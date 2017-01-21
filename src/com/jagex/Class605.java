package com.jagex;

import com.jagex.Class11;
import com.jagex.Class115;
import com.jagex.Class149;
import com.jagex.Class170;
import com.jagex.Class192;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class4;
import com.jagex.OutFrame;
import com.jagex.Class448_Sub1;
import com.jagex.Class45;
import com.jagex.OutFrameBuffer;
import com.jagex.Class615;
import com.jagex.Class673;
import com.jagex.Class676;
import com.jagex.Class681;
import com.jagex.client;

public abstract class Class605 {
   boolean aBool7903;
   int anInt7900;
   Class192 aClass192_7897 = new Class192(500);
   Class192 aClass192_7898 = new Class192(30);
   Class192 aClass192_7899 = new Class192(50);
   Class170[] aClass170Array7902 = new Class170[4];
   Class4 aClass4_7896 = new Class4((Object)null, (Object)null);
   String[] aStringArray7901;

   abstract boolean method7104(int var1, int var2);

   void method7105(boolean var1, int var2) {
      if(this.aBool7903 != var1) {
         this.aBool7903 = var1;
         this.method7124(-1948141578);
      }
   }

   void method7106(int var1, byte var2) {
      this.anInt7900 = -64109423 * var1;
      Class192 var3 = this.aClass192_7897;
      synchronized(var3) {
         this.aClass192_7897.method2770(1037557229);
      }

      var3 = this.aClass192_7898;
      synchronized(var3) {
         this.aClass192_7898.method2770(938048804);
      }

      var3 = this.aClass192_7899;
      synchronized(var3) {
         this.aClass192_7899.method2770(964804484);
      }
   }

   abstract byte[] method7107(int var1, byte var2);

   void method7108(int var1, byte var2) {
      Class192 var3 = this.aClass192_7897;
      synchronized(var3) {
         this.aClass192_7897.method2769(var1, (byte)-20);
      }

      var3 = this.aClass192_7898;
      synchronized(var3) {
         this.aClass192_7898.method2769(var1, (byte)-38);
      }

      var3 = this.aClass192_7899;
      synchronized(var3) {
         this.aClass192_7899.method2769(var1, (byte)-13);
      }
   }

   void method7109(int var1) {
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2772(-590357315);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2772(-1309880458);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2772(-608560162);
      }
   }

   abstract byte[] method7110(int var1);

   Class605(boolean var1, Class673 var2, Class676 var3) {
      this.aBool7903 = var1;
      if(var3 == Class676.aClass676_8589) {
         this.aStringArray7901 = new String[]{null, null, null, null, null, Class45.aClass45_591.method920(var2, -827840379)};
      } else {
         this.aStringArray7901 = new String[]{null, null, null, null, null, null};
      }

   }

   abstract byte[] method7111(int var1);

   abstract byte[] method7112(int var1);

   abstract boolean method7113(int var1);

   abstract boolean method7114(int var1);

   abstract boolean method7115(int var1);

   abstract boolean method7116(int var1);

   void method7117() {
      Class192 var1 = this.aClass192_7897;
      synchronized(var1) {
         this.aClass192_7897.method2770(207153287);
      }

      var1 = this.aClass192_7898;
      synchronized(var1) {
         this.aClass192_7898.method2770(1748738817);
      }

      var1 = this.aClass192_7899;
      synchronized(var1) {
         this.aClass192_7899.method2770(537948180);
      }

      this.aClass170Array7902 = new Class170[4];
      this.aClass4_7896 = new Class4((Object)null, (Object)null);
   }

   abstract byte[] method7118(int var1);

   void method7119(int var1) {
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2769(var1, (byte)-128);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2769(var1, (byte)-60);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2769(var1, (byte)-73);
      }
   }

   void method7120(int var1) {
      this.anInt7900 = -64109423 * var1;
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2770(1191126238);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2770(1674484774);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2770(1154179572);
      }
   }

   void method7121(int var1) {
      this.anInt7900 = -64109423 * var1;
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2770(1810163822);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2770(1873636047);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2770(1835076926);
      }
   }

   void method7122() {
      Class192 var1 = this.aClass192_7897;
      synchronized(var1) {
         this.aClass192_7897.method2770(1355542390);
      }

      var1 = this.aClass192_7898;
      synchronized(var1) {
         this.aClass192_7898.method2770(919295254);
      }

      var1 = this.aClass192_7899;
      synchronized(var1) {
         this.aClass192_7899.method2770(549793360);
      }

      this.aClass170Array7902 = new Class170[4];
      this.aClass4_7896 = new Class4((Object)null, (Object)null);
   }

   void method7123(int var1) {
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2769(var1, (byte)-21);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2769(var1, (byte)-66);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2769(var1, (byte)-119);
      }
   }

   void method7124(int var1) {
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2770(1126761917);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2770(1750563756);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2770(276298926);
      }

      this.aClass170Array7902 = new Class170[4];
      this.aClass4_7896 = new Class4((Object)null, (Object)null);
   }

   void method7125(int var1) {
      Class192 var2 = this.aClass192_7897;
      synchronized(var2) {
         this.aClass192_7897.method2769(var1, (byte)-10);
      }

      var2 = this.aClass192_7898;
      synchronized(var2) {
         this.aClass192_7898.method2769(var1, (byte)-38);
      }

      var2 = this.aClass192_7899;
      synchronized(var2) {
         this.aClass192_7899.method2769(var1, (byte)-5);
      }
   }

   void method7126() {
      Class192 var1 = this.aClass192_7897;
      synchronized(var1) {
         this.aClass192_7897.method2772(78443655);
      }

      var1 = this.aClass192_7898;
      synchronized(var1) {
         this.aClass192_7898.method2772(-2097309254);
      }

      var1 = this.aClass192_7899;
      synchronized(var1) {
         this.aClass192_7899.method2772(1344008348);
      }
   }

   void method7127() {
      Class192 var1 = this.aClass192_7897;
      synchronized(var1) {
         this.aClass192_7897.method2772(270090614);
      }

      var1 = this.aClass192_7898;
      synchronized(var1) {
         this.aClass192_7898.method2772(-274348762);
      }

      var1 = this.aClass192_7899;
      synchronized(var1) {
         this.aClass192_7899.method2772(-1908001048);
      }
   }

   static final void method7128(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class11 var3 = (Class11)Class448_Sub1.aClass40_Sub1_10233.method89(var2, -117915562);
      if(var3.anInt86 * 1201332159 >= 0 && 1447315211 * var3.anInt120 >= 0) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1447315211 * var3.anInt120;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
      }

   }

   static final void method7129(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      OutFrameBuffer var3 = Class115.method1414(OutFrame.aClass405_4277, client.aClass111_11060.aClass14_1342, -524749180);
      var3.out.writeByte(var2.length() + 1, 504535985);
      var3.out.method9616(var2, 1081533648);
      client.aClass111_11060.write(var3, (byte)-35);
   }

   static final void method7130(InterfaceDef var0, Class243 var1, Class681 var2, byte var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2511 = Class615.method7280(var4, var2, -1834948818);
      var0.aBool2560 = true;
   }
}
