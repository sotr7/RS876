package com.jagex;

import com.jagex.Class10;
import com.jagex.Class247;
import com.jagex.Class255;
import com.jagex.Class397;
import com.jagex.Class418;
import com.jagex.Class473;
import com.jagex.Class526_Sub21_Sub15_Sub3;
import com.jagex.Class526_Sub21_Sub3;
import com.jagex.Class681;
import com.jagex.Class83;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Class453 {
   static final int anInt4952 = 10;
   long aLong4954;
   static final int anInt4955 = 2;
   static final int anInt4956 = 10000;
   static final int anInt4958 = 10000;
   static final int anInt4959 = 60000;
   volatile int anInt4953 = 0;
   ExecutorService anExecutorService4949 = Executors.newFixedThreadPool(2);
   boolean aBool4960 = false;
   String webAddress;
   int webPort;
   int anInt4957;

   void method5374() {
      this.anInt4953 -= -650065485;
   }

   boolean method5375(int var1) {
      return this.anInt4953 * 1532693883 >= 10;
   }

   Class526_Sub21_Sub15_Sub3 method5376(byte var1) {
      return this.method5377(255, 255, (byte)0, true, 0, 0, 696273647);
   }

   Class526_Sub21_Sub15_Sub3 method5377(int var1, int var2, byte var3, boolean var4, int var5, int var6, int var7) {
      if(var1 >= 0 && var2 >= 0) {
         if(this.method5375(-1882150032)) {
            return null;
         } else {
            boolean var8 = var1 == 255 && 255 == var2;
            if(!this.aBool4960 && !var8) {
               return null;
            } else if(10000L + -1729353548563955195L * this.aLong4954 >= Class255.time((byte)24)) {
               return null;
            } else {
               URL url = null;
               String var10;
               if(var8) {
                  var10 = "&cb=" + Class255.time((byte)24);
               } else {
                  var10 = "&c=" + var5 + "&v=" + var6;
               }

               try {
                  //url = new URL("http", this.webAddress, -1803046943 * this.webPort, "/ms?m=" + 2039977137 * this.anInt4957 + "&a=" + var1 + "&g=" + var2 + var10);
                  url = new URL("http", "content.runescape.com", 80, "/ms?m=" + 2039977137 * this.anInt4957 + "&a=" + var1 + "&g=" + var2 + var10);
               } catch (MalformedURLException var13) {
                  return null;
               }

               Class526_Sub21_Sub15_Sub3 var11 = new Class526_Sub21_Sub15_Sub3(var3);
               var11.aBool11829 = var4;
               this.anInt4953 += -650065485;
               Future var12 = this.anExecutorService4949.submit(new Class473(this, url, var11));
               var11.method10964(var12, -1398060550);
               return var11;
            }
         }
      } else {
         throw new RuntimeException(var1 + "," + var2);
      }
   }

   boolean method5378() {
      return this.anInt4953 * 1532693883 >= 10;
   }

   public Class453(String var1, int var2, int var3) {
      this.webAddress = var1;
      this.webPort = 1214043169 * var2;
      this.anInt4957 = 934687825 * var3;
   }

   void method5379(boolean var1, short var2) {
      this.aBool4960 = var1;
   }

   boolean method5380() {
      return this.anInt4953 * 1532693883 >= 10;
   }

   boolean method5381() {
      return this.anInt4953 * 1532693883 >= 10;
   }

   public void method5382(int var1) {
      this.anExecutorService4949.shutdown();
   }

   void method5383(int var1) {
      this.anInt4953 -= -650065485;
   }

   void method5384(boolean var1) {
      this.aBool4960 = var1;
   }

   void method5385(boolean var1) {
      this.aBool4960 = var1;
   }

   static final void method5386(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1];
      Class83 var4 = (Class83)Class10.aClass40_Sub20_62.method89(var3, 355232917);
      if(var4.method1167(966215449)) {
         var0.anObjectArray8624[(var0.anInt8625 += 2019513325) * 540934629 - 1] = ((Class526_Sub21_Sub3)Class247.aClass59_Sub2_2689.method89(var2, -1112055434)).method10425(var3, var4.aString842, (byte)46);
      } else {
         var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = ((Class526_Sub21_Sub3)Class247.aClass59_Sub2_2689.method89(var2, -1065210269)).method10422(var3, var4.anInt843 * 1040538721, (byte)72);
      }

   }

   static final void method5387(Class681 var0, byte var1) {
      Class418.method4974(Class397.method4824((byte)1), (byte)113);
   }
}
