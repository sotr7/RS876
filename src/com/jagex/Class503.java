package com.jagex;

import com.jagex.Class271;
import com.jagex.Class280;
import com.jagex.Class31;
import com.jagex.Class415;
import com.jagex.Class526_Sub21_Sub10;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class526_Sub32;
import com.jagex.Class681;
import com.jagex.client;

public class Class503 {
   int anInt5646;
   int anInt5643;
   int anInt5644;
   int anInt5645;
   String aString5647;

   String method6027(byte var1) {
      return this.aString5647;
   }

   int method6028(int var1) {
      return this.anInt5646 * -720498813;
   }

   int method6029(int var1) {
      return this.anInt5643 * -557280945;
   }

   int method6030(int var1) {
      return this.anInt5644 * 1618987961;
   }

   int method6031(int var1) {
      return 860980327 * this.anInt5645;
   }

   int method6032() {
      return this.anInt5644 * 1618987961;
   }

   int method6033() {
      return this.anInt5646 * -720498813;
   }

   public Class503(int var1, int var2, int var3, int var4, String var5) {
      this.anInt5646 = var1 * -941295829;
      this.anInt5643 = var2 * -1572346449;
      this.anInt5644 = var3 * -1313027447;
      this.anInt5645 = var4 * -1305782441;
      this.aString5647 = var5;
   }

   int method6034() {
      return this.anInt5646 * -720498813;
   }

   int method6035() {
      return this.anInt5646 * -720498813;
   }

   int method6036() {
      return this.anInt5644 * 1618987961;
   }

   String method6037() {
      return this.aString5647;
   }

   int method6038() {
      return 860980327 * this.anInt5645;
   }

   int method6039() {
      return this.anInt5646 * -720498813;
   }

   int method6040() {
      return 860980327 * this.anInt5645;
   }

   public static void method6041(int var0, int var1, String var2, String var3, String var4, String var5, String var6, int var7, Class415 var8, int var9) {
      Class271 var10 = (Class271)Class280.aMap3037.get(Integer.valueOf(var0));
      if(var10 == null) {
         var10 = new Class271();
         Class280.aMap3037.put(Integer.valueOf(var0), var10);
      }

      Class526_Sub21_Sub10 var11 = var10.method3596(var0, var1, var2, var3, var4, var5, var6, var7, var8, -1568274659);
      Class280.aClass20_3036.put(var11, (long)(var11.anInt11729 * 731545197));
      Class280.aClass696_3038.offer(var11, (byte)-43);
      client.anInt11215 = -1924977029 * client.anInt11214;
   }

   static final void method6042(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = client.aClass492ArrayArray11265[var3][var2].anInt5525 * 335652639;
   }

   static final void method6043(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0;
   }

   public static Class526_Sub32 method6044(Class526_Sub32 var0, int var1) {
      Class526_Sub32[] var2 = Class526_Sub32.aClass526_Sub32Array10595;
      synchronized(var2) {
         if(-47844285 * Class526_Sub32.anInt10596 == 0) {
            return new Class526_Sub32(var0);
         } else {
            Class526_Sub32.aClass526_Sub32Array10595[(Class526_Sub32.anInt10596 -= 1247213675) * -47844285].method9584(var0, (byte)-5);
            return Class526_Sub32.aClass526_Sub32Array10595[-47844285 * Class526_Sub32.anInt10596];
         }
      }
   }

   public static String method6045(Class526_Sub21_Sub6 var0, int var1) {
      return !Class31.aBool291 && null != var0?((var0.aString11650 == null || var0.aString11650.length() == 0) && var0.aString11660 != null && var0.aString11660.length() > 0?var0.aString11660:var0.aString11650):"";
   }
}
