package com.jagex;

import com.jagex.Class149;
import com.jagex.Class21;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class40_Sub8;
import com.jagex.Class502;
import com.jagex.GameMap;
import com.jagex.Class509;
import com.jagex.Class526_Sub21_Sub6;
import com.jagex.Class538;
import com.jagex.Class610;
import com.jagex.Class615;
import com.jagex.Class616;
import com.jagex.Class619;
import com.jagex.Class681;
import com.jagex.Interface59;
import com.jagex.client;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;

public class Class517 implements Runnable {
   static Class526_Sub21_Sub6 aClass526_Sub21_Sub6_7040;
   static int anInt7041;
   volatile boolean aBool7037 = false;
   LinkedList aLinkedList7038 = new LinkedList();
   GameMap aClass505_7039 = new GameMap(true);

   public void method6216(Class40_Sub8 var1, int var2) {
      this.aClass505_7039.method6121(var1, -1779168267);
   }

   public void method6217(Class509 var1, int var2) {
      LinkedList var3 = this.aLinkedList7038;
      synchronized(var3) {
         this.aLinkedList7038.add(var1);
         this.aLinkedList7038.notify();
      }
   }

   public boolean method6218(int var1) {
      return this.aBool7037;
   }

   void method6219(GameMap var1, int var2) {
      this.aClass505_7039 = var1;
   }

   public void run() {
      while(true) {
         this.method6220(-2141138401);
      }
   }

   void method6220(int var1) {
      Class509 var2 = null;
      LinkedList var3 = this.aLinkedList7038;
      synchronized(var3) {
         try {
            this.aLinkedList7038.wait();
         } catch (InterruptedException var11) {
            ;
         }

         var2 = (Class509)this.aLinkedList7038.pollFirst();
      }

      try {
         try {
            if(var2 != null) {
               this.aBool7037 = true;
               this.method6223(var2, -2147420701);
            }
         } catch (Exception var13) {
            this.aBool7037 = false;
            return;
         }

         this.aBool7037 = false;
      } finally {
         this.aBool7037 = false;
      }
   }

   public void method6221() {
      while(true) {
         this.method6220(-2112710955);
      }
   }

   void method6222() {
      Class509 var1 = null;
      LinkedList var2 = this.aLinkedList7038;
      synchronized(var2) {
         try {
            this.aLinkedList7038.wait();
         } catch (InterruptedException var10) {
            ;
         }

         var1 = (Class509)this.aLinkedList7038.pollFirst();
      }

      try {
         try {
            if(var1 != null) {
               this.aBool7037 = true;
               this.method6223(var1, -1288121295);
            }
         } catch (Exception var12) {
            this.aBool7037 = false;
            return;
         }

         this.aBool7037 = false;
      } finally {
         this.aBool7037 = false;
      }
   }

   void method6223(Class509 var1, int var2) {
      if(Class502.aClass502_5640 == var1.aClass502_6977) {
         this.aClass505_7039.method6078(-2015905933);
      } else {
         this.aClass505_7039.method6120(var1, (byte)1);
      }

      for(boolean var3 = this.aClass505_7039.method6089(1352212084); !var3; var3 = this.aClass505_7039.method6089(-84891482)) {
         ;
      }

      this.aClass505_7039.method6075(381958352);
      client.aClass505_11204.method6075(646248536);
   }

   public boolean method6224() {
      return this.aBool7037;
   }

   public GameMap method6225(int var1) {
      return this.aClass505_7039;
   }

   public void method6226() {
      while(true) {
         this.method6220(-2099061096);
      }
   }

   public boolean method6227() {
      return this.aBool7037;
   }

   void method6228() {
      Class509 var1 = null;
      LinkedList var2 = this.aLinkedList7038;
      synchronized(var2) {
         try {
            this.aLinkedList7038.wait();
         } catch (InterruptedException var10) {
            ;
         }

         var1 = (Class509)this.aLinkedList7038.pollFirst();
      }

      try {
         try {
            if(var1 != null) {
               this.aBool7037 = true;
               this.method6223(var1, -2067444826);
            }
         } catch (Exception var12) {
            this.aBool7037 = false;
            return;
         }

         this.aBool7037 = false;
      } finally {
         this.aBool7037 = false;
      }
   }

   static final void method6229(InterfaceDef var0, Class243 var1, Class681 var2, int var3) {
      String var4 = (String)var2.anObjectArray8624[(var2.anInt8625 -= 2019513325) * 540934629];
      if(Class149.method1747(var4, var2, (byte)0) != null) {
         var4 = var4.substring(0, var4.length() - 1);
      }

      var0.anObjectArray2636 = Class615.method7280(var4, var2, -1614368407);
      var0.aBool2560 = true;
   }

   static byte[] method6230(File var0, int var1, byte var2) {
      try {
         byte[] var3 = new byte[var1];
         Class616.method7308(var0, var3, var1, (byte)72);
         return var3;
      } catch (IOException var4) {
         return null;
      }
   }

   public static void method6231(int var0) {
      Class21 var1 = Class619.method7340("2", client.aClass676_11127.aString8591, true, 1460257427);
      Class538.aClass149_Sub1_7225.method8343(var1, (byte)19);
   }

   static final void method6232(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1;
   }

   static long method6233(Interface59 var0, int var1, int var2, int var3) {
      long var4 = 4194304L;
      long var6 = Long.MIN_VALUE;
      Class610 var8 = (Class610)client.aClass505_11204.method6066(-631188979).method89(var0.method56(259999532), -494491570);
      long var9 = (long)(var1 | var2 << 7 | var0.method87(1179297927) << 14 | var0.method379((byte)102) << 20 | 1073741824);
      if(0 == 909601847 * var8.anInt7954) {
         var9 |= var6;
      }

      if(1 == 86646899 * var8.anInt7987) {
         var9 |= var4;
      }

      var9 |= (long)var0.method56(86569736) << 32;
      return var9;
   }
}
