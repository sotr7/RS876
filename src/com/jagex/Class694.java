package com.jagex;

import com.jagex.Class107;
import com.jagex.Class22;
import com.jagex.Class221;
import com.jagex.Class229;
import com.jagex.InterfaceDef;
import com.jagex.Class258;
import com.jagex.Class31;
import com.jagex.Class315_Sub1;
import com.jagex.Class318_Sub2;
import com.jagex.Class380_Sub1;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class681;
import com.jagex.Class93;

public final class Class694 {
   int anInt8715;
   int anInt8716;
   int anInt8717;
   byte[] aByteArray8721;
   int anInt8723;
   byte[] aByteArray8724;
   int anInt8726;
   byte aByte8728;
   int anInt8729;
   int anInt8730;
   int anInt8731;
   int anInt8732;
   int anInt8734;
   int anInt8737;
   int anInt8739;
   int anInt8752;
   int anInt8735 = 4096;
   int anInt8742 = 16;
   int anInt8747 = 258;
   int anInt8718 = 6;
   int anInt8719 = 50;
   int anInt8748 = 18002;
   int anInt8722 = 0;
   int anInt8725 = 0;
   int[] anIntArray8736 = new int[256];
   int[] anIntArray8720 = new int[257];
   boolean[] aBoolArray8740 = new boolean[256];
   boolean[] aBoolArray8733 = new boolean[16];
   byte[] aByteArray8749 = new byte[256];
   byte[] aByteArray8743 = new byte[4096];
   int[] anIntArray8744 = new int[16];
   byte[] aByteArray8745 = new byte[18002];
   byte[] aByteArray8746 = new byte[18002];
   byte[][] aByteArrayArray8741 = new byte[6][258];
   int[][] anIntArrayArray8750 = new int[6][258];
   int[][] anIntArrayArray8738 = new int[6][258];
   int[][] anIntArrayArray8727 = new int[6][258];
   int[] anIntArray8751 = new int[6];

   public static int[] method8113(int var0, int var1) {
      int[] var2 = new int[3];
      Class258.method3514(Class229.method3177(var0, 1112953628));
      var2[0] = Class93.aCalendar899.get(5);
      var2[1] = Class93.aCalendar899.get(2);
      var2[2] = Class93.aCalendar899.get(1);
      return var2;
   }

   static final void method8114(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var4 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      if(!Class22.method676(var2.charAt(0), 476630695)) {
         throw new RuntimeException();
      } else if(!var2.isEmpty() && var2.length() <= 10) {
         if(!Class380_Sub1.aClass269_10121.method3578(var2, var3, var4, 790295043)) {
            throw new RuntimeException();
         }
      } else {
         throw new RuntimeException();
      }
   }

   static final void method8115(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      boolean var3 = true;
      if(var2 < 0) {
         var3 = 0 == (1 + var2) % 4;
      } else if(var2 < 1582) {
         var3 = var2 % 4 == 0;
      } else if(0 != var2 % 4) {
         var3 = false;
      } else if(0 != var2 % 100) {
         var3 = true;
      } else if(var2 % 400 != 0) {
         var3 = false;
      }

      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var3?1:0;
   }

   public static boolean method8116(int var0, int var1, int var2) {
      if(!Class31.aBool291) {
         return false;
      } else {
         int var3 = var0 >> 16;
         int var4 = var0 & '\uffff';
         if(null != Class315_Sub1.aClass243Array10033[var3] && null != Class315_Sub1.aClass243Array10033[var3].aClass245Array2459[var4]) {
            InterfaceDef var5 = Class315_Sub1.aClass243Array10033[var3].aClass245Array2459[var4];
            Class526_Sub21_Sub6 var6;
            if(var1 == -1 && 0 == var5.type * -449120703) {
               for(var6 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)59); null != var6; var6 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(2119402631)) {
                  if(58 == var6.anInt11659 * 976428997 || 1007 == var6.anInt11659 * 976428997 || var6.anInt11659 * 976428997 == 25 || 57 == 976428997 * var6.anInt11659 || 976428997 * var6.anInt11659 == 30) {
                     for(InterfaceDef var7 = Class221.method3095(var6.anInt11655 * 1182196211, (byte)34); null != var7; var7 = Class107.method1347(Class315_Sub1.aClass243Array10033[919258769 * var7.uid >> 16], var7, -1244032751)) {
                        if(919258769 * var7.uid == 919258769 * var5.uid) {
                           return true;
                        }
                     }
                  }
               }
            } else {
               for(var6 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8206((byte)104); var6 != null; var6 = (Class526_Sub21_Sub6)Class31.aClass702_292.method8181(-744715024)) {
                  if(-2014967153 * var6.anInt11654 == var1 && 1182196211 * var6.anInt11655 == var5.uid * 919258769 && (976428997 * var6.anInt11659 == 58 || 976428997 * var6.anInt11659 == 1007 || 976428997 * var6.anInt11659 == 25 || 57 == 976428997 * var6.anInt11659 || var6.anInt11659 * 976428997 == 30)) {
                     return true;
                  }
               }
            }

            return false;
         } else {
            return false;
         }
      }
   }

   static final void method8117(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class318_Sub2.method9085(var2, var3, false, (byte)91);
   }
}
