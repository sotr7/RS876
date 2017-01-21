package com.jagex;

import com.jagex.Class168;
import com.jagex.Class170;
import com.jagex.Class174;
import com.jagex.Class192;
import com.jagex.Class221;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.Class466;
import com.jagex.Class526_Sub21_Sub11;
import com.jagex.Class54;
import com.jagex.Class566;
import com.jagex.Class567_Sub1;
import com.jagex.Class610;
import com.jagex.Class681;
import com.jagex.Class704;
import com.jagex.Interface14;
import com.jagex.Interface7;
import com.jagex.client;

public abstract class Class193 implements Interface7 {
   public static Class466 aClass466_2176;
   Class192 aClass192_2175 = new Class192(100);
   Interface14 anInterface14_2174;

   void method2792(int var1) {
      Class192 var2 = this.aClass192_2175;
      synchronized(var2) {
         this.aClass192_2175.method2772(-282884351);
      }
   }

   Class526_Sub21_Sub11 method2793(int var1, int var2) {
      Class192 var3 = this.aClass192_2175;
      synchronized(var3) {
         Class526_Sub21_Sub11 var4 = (Class526_Sub21_Sub11)this.aClass192_2175.method2765((long)var1);
         if(var4 == null) {
            var4 = new Class526_Sub21_Sub11(var1);
            this.aClass192_2175.method2768(var4, (long)var1);
         }

         return !var4.method10642((byte)30)?null:var4;
      }
   }

   void method2794(int var1) {
      Class192 var2 = this.aClass192_2175;
      synchronized(var2) {
         this.aClass192_2175.method2770(336178633);
      }
   }

   void method2795(int var1, int var2) {
      Class192 var3 = this.aClass192_2175;
      synchronized(var3) {
         this.aClass192_2175.method2769(var1, (byte)-70);
      }
   }

   Class193(Interface14 var1, Class466 var2, Class466 var3) {
      this.anInterface14_2174 = var1;
      Class567_Sub1.method9556(var2, var3, 2, (short)30180);
   }

   void method2796() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2770(394486180);
      }
   }

   void method2797() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2770(1912777180);
      }
   }

   void method2798() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2770(137878910);
      }
   }

   void method2799() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2772(-461152646);
      }
   }

   void method2800() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2770(1151919073);
      }
   }

   void method2801(int var1) {
      Class192 var2 = this.aClass192_2175;
      synchronized(var2) {
         this.aClass192_2175.method2769(var1, (byte)-124);
      }
   }

   void method2802() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2772(1171891881);
      }
   }

   void method2803() {
      Class192 var1 = this.aClass192_2175;
      synchronized(var1) {
         this.aClass192_2175.method2772(952809058);
      }
   }

   static final void method2804(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-71);
      Class243 var4 = Class315_Sub1.aClass243Array10033[var2 >> 16];
      Class610.method7209(var3, var4, var0, -1073660555);
   }

   static final void method2805(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(2 == client.anInt11288 * 2029719417 && var2 < -17244221 * client.anInt11130) {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass50Array11290[var2].anInt655 * -877949861;
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
      }

   }

   static final void method2806(Class681 var0, byte var1) {
      int var2 = client.aClass20_11187.method636(-2017020250);
      if(client.anInt11186 * -327748687 != -1) {
         ++var2;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
   }

   static final void method2807(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3122(var2, (byte)69).method3022(-1775435346);
   }

   public static Class168 method2808(Class174 var0, int var1, int var2, int var3, int var4, Class168 var5, short var6, byte var7, Class704 var8, int var9) {
      if(var5 == null) {
         return null;
      } else {
         int var10 = 2055;
         if(var8 != null) {
            var10 |= var8.method8221((byte)88);
            var10 &= -513;
         }

         long var11 = (long)((var6 & '\uffff') << 8 | var7);
         Class192 var13 = Class54.aClass192_666;
         Class168 var14;
         synchronized(var13) {
            var14 = (Class168)Class54.aClass192_666.method2765(var11);
         }

         if(null == var14 || var0.method2464(var14.method2101(), var10) != 0) {
            if(var14 != null) {
               var10 = var0.method2533(var10, var14.method2101());
            }

            Class170 var21 = new Class170(4, 2, 2);
            short var15 = 128;
            int[] var16 = new int[]{var21.method2150(-var15, 0, -var15), var21.method2150(var15, 0, -var15), var21.method2150(var15, 0, var15), var21.method2150(-var15, 0, var15)};
            var21.method2133(0, 1, 2, (byte)1, (byte)0, (short)0, var7, var6);
            var21.method2133(0, 2, 3, (byte)1, (byte)0, (short)0, var7, var6);
            var21.method2134((short)1, (short)2, (short)0);
            var21.method2134((short)2, (short)3, (short)0);
            var14 = var0.method2321(var21, var10, 149397041 * Class54.anInt667, 64, 768);
            Class192 var17 = Class54.aClass192_666;
            synchronized(var17) {
               Class54.aClass192_666.method2768(var14, var11);
            }
         }

         int var22 = var5.method1979();
         int var23 = var5.method1980();
         int var24 = var5.method1983();
         int var25 = var5.method1984();
         if(null != var8) {
            var14 = var14.method1947((byte)3, var10, true);
            var14.method1957(var23 - var22 >> 1, 128, var25 - var24 >> 1);
            var14.method1955(var22 + var23 >> 1, 0, var25 + var24 >> 1);
            var8.method8233(var14, -1902897884);
         } else {
            var14 = var14.method1947((byte)3, var10, true);
            var14.method1957(var23 - var22 >> 1, 128, var25 - var24 >> 1);
            var14.method1955(var23 + var22 >> 1, 0, var25 + var24 >> 1);
         }

         if(var2 != 0) {
            var14.method2076(var2);
         }

         if(0 != var3) {
            var14.method1954(var3);
         }

         if(var4 != 0) {
            var14.method1955(0, var4, 0);
         }

         return var14;
      }
   }
}
