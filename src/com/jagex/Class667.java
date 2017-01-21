package com.jagex;

import com.jagex.Class144;
import com.jagex.Class192;
import com.jagex.Class457;
import com.jagex.Class466;
import com.jagex.Class471;
import com.jagex.RSByteBuffer;
import com.jagex.Class633;
import com.jagex.Class706;
import com.jagex.Class75;
import com.jagex.Interface76;
import java.io.IOException;
import java.util.Iterator;

public class Class667 {
   static int anInt8531;
   public static Class667 aClass667_8530 = new Class667();
   public static Class667 aClass667_8529 = new Class667();
   static Class667 aClass667_8528 = new Class667();

   public static void method7957(int var0) {
      Class192 var1 = Class633.aClass192_8256;
      synchronized(var1) {
         Class633.aClass192_8256.method2770(2118775903);
      }

      var1 = Class633.aClass192_8239;
      synchronized(var1) {
         Class633.aClass192_8239.method2770(1210833659);
      }
   }

   static final byte[] method7958(byte[] var0, int var1) {
      RSByteBuffer var2 = new RSByteBuffer(var0);
      Class471 var3 = new Class471(var2);
      Class457 var4 = var3.method5629(2005609396);
      int var5 = var3.method5630(301018015);
      if(var5 < 0 || 0 != Class466.anInt5333 * -1695367749 && var5 > Class466.anInt5333 * -1695367749) {
         throw new RuntimeException();
      } else if(Class457.UNCOMPRESSED == var4) {
         byte[] var12 = new byte[var5];
         var2.writeBytes(var12, 0, var5, -757780639);
         return var12;
      } else {
         int var6 = var3.method5631((short)4358);
         if(var6 < 0 || Class466.anInt5333 * -1695367749 != 0 && var6 > Class466.anInt5333 * -1695367749) {
            throw new RuntimeException();
         } else {
            byte[] var7;
            if(var4 == Class457.aClass457_5166) {
               var7 = new byte[var6];
               Class706.method8293(var7, var6, var0, var5, 9);
            } else if(var4 == Class457.aClass457_5162) {
               var7 = new byte[var6];
               Class75 var8 = Class466.aClass75_5325;
               synchronized(var8) {
                  Class466.aClass75_5325.method1114(var2, var7, 127478084);
               }
            } else {
               if(var4 != Class457.aClass457_5163) {
                  throw new RuntimeException();
               }

               try {
                  var7 = Class144.method1669(var2, var6, 2050715514);
               } catch (IOException var10) {
                  throw new RuntimeException(var10);
               }
            }

            return var7;
         }
      }
   }

   static int method7959(Iterable var0, byte var1) {
      int var2 = -1;
      Iterator var3 = var0.iterator();

      while(var3.hasNext()) {
         Interface76 var4 = (Interface76)var3.next();
         if(var4.getId() > var2) {
            var2 = var4.getId();
         }
      }

      return (var2 + 8) / 8;
   }
}
