package com.jagex;

import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class348;
import com.jagex.Class564;
import com.jagex.Class653;
import com.jagex.Class679;
import com.jagex.Class681;

public class Class603 {
   public static Class348 aClass348_7890;
   static Class564 aClass564_7891;
   public static Class603 aClass603_7888 = new Class603(0);
   public static Class603 aClass603_7887 = new Class603(1);
   public static Class603 aClass603_7889 = new Class603(2);

   Class603(int var1) {
   }

   public static String method7099(byte[] var0, int var1, int var2, int var3) {
      char[] var4 = new char[var2];
      int var5 = 0;
      int var6 = var1;

      int var9;
      for(int var7 = var2 + var1; var6 < var7; var4[var5++] = (char)var9) {
         int var8 = var0[var6++] & 255;
         if(var8 < 128) {
            if(var8 == 0) {
               var9 = '\ufffd';
            } else {
               var9 = var8;
            }
         } else if(var8 < 192) {
            var9 = '\ufffd';
         } else if(var8 < 224) {
            if(var6 < var7 && 128 == (var0[var6] & 192)) {
               var9 = (var8 & 31) << 6 | var0[var6++] & 63;
               if(var9 < 128) {
                  var9 = '\ufffd';
               }
            } else {
               var9 = '\ufffd';
            }
         } else if(var8 < 240) {
            if(1 + var6 < var7 && (var0[var6] & 192) == 128 && (var0[var6 + 1] & 192) == 128) {
               var9 = (var8 & 15) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if(var9 < 2048) {
                  var9 = '\ufffd';
               }
            } else {
               var9 = '\ufffd';
            }
         } else if(var8 < 248) {
            if(2 + var6 < var7 && 128 == (var0[var6] & 192) && (var0[1 + var6] & 192) == 128 && 128 == (var0[2 + var6] & 192)) {
               var9 = (var8 & 7) << 18 | (var0[var6++] & 63) << 12 | (var0[var6++] & 63) << 6 | var0[var6++] & 63;
               if(var9 >= 65536 && var9 <= 1114111) {
                  var9 = '\ufffd';
               } else {
                  var9 = '\ufffd';
               }
            } else {
               var9 = '\ufffd';
            }
         } else {
            var9 = '\ufffd';
         }
      }

      return new String(var4, 0, var5);
   }

   static final void method7100(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class653.method7795(var3, var4, var0, (byte)0);
   }
}
