package com.jagex;

import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class384;
import com.jagex.Class389;
import com.jagex.Class394;
import com.jagex.Class415;
import com.jagex.Class570;
import com.jagex.Class587;
import com.jagex.Class681;
import com.jagex.Interface45;
import com.jagex.client;

public class Class387 implements Interface45 {
   public static final int anInt4048 = 1;
   public static final int anInt4049 = 2;
   public static final int anInt4056 = 0;
   public Class384 aClass384_4050;
   public Class389 aClass389_4051;
   public int anInt4047;
   public int anInt4053;
   public int anInt4055;
   public int anInt4052;
   public int anInt4054;

   public Class394 method346(int var1) {
      return Class394.aClass394_4106;
   }

   Class387(Class384 var1, Class389 var2, int var3, int var4, int var5, int var6, int var7) {
      this.aClass384_4050 = var1;
      this.aClass389_4051 = var2;
      this.anInt4047 = -1743610381 * var3;
      this.anInt4053 = 1678483733 * var4;
      this.anInt4055 = 378070789 * var5;
      this.anInt4052 = var6 * 1286976219;
      this.anInt4054 = -324987537 * var7;
   }

   public Class394 method345() {
      return Class394.aClass394_4106;
   }

   static final void method4760(Class681 var0, short var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      InterfaceDef var3 = Class221.method3095(var2, (byte)-46);
      Class415.method4933(var3, var0, (byte)-8);
   }

   static final void method4761(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      int var4 = client.aClass492ArrayArray11265[var3][var2].method5878((byte)-113);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 2 == var4?1:0;
   }

   public static final int method4762(int var0, int var1, int var2, int var3) {
      if(client.aClass505_11204.method6072(-2010445815) == null) {
         return 0;
      } else {
         int var4 = var0 >> 9;
         int var5 = var1 >> 9;
         if(var4 >= 0 && var5 >= 0 && var4 <= client.aClass505_11204.method6056(-1746741811) - 1 && var5 <= client.aClass505_11204.method6057(126749238) - 1) {
            int var6 = var2;
            if(var2 < 3 && (client.aClass505_11204.method6094((byte)-108).aByteArrayArrayArray5356[1][var4][var5] & 2) != 0) {
               var6 = var2 + 1;
            }

            return client.aClass505_11204.method6072(71984890).aClass148Array7288[var6].method1707(var0, var1, 696317798);
         } else {
            return 0;
         }
      }
   }

   public static void method4763(int var0, int var1, int var2, int var3, int var4) {
      Class570.aLinkedList7648.addLast(new Class587(var0, var1, var2 - var0, var3 - var1));
   }
}
