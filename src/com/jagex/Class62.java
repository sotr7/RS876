package com.jagex;

import com.jagex.Class304_Sub1;
import com.jagex.Class681;
import com.jagex.client;
import jaclib.ping.Ping;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Class62 implements Runnable {
   volatile long aLong735 = -1645125888039874841L;
   volatile boolean aBool732 = true;
   String aString733;
   InetAddress anInetAddress734;

   void method1043(String var1, byte var2) {
      this.aString733 = var1;
      this.anInetAddress734 = null;
      this.aLong735 = -1645125888039874841L;
      if(this.aString733 != null) {
         try {
            this.anInetAddress734 = InetAddress.getByName(this.aString733);
         } catch (UnknownHostException var4) {
            ;
         }
      }

   }

   long method1044(byte var1) {
      return this.aLong735 * 2791791504216054569L;
   }

   void method1045(String var1) {
      this.aString733 = var1;
      this.anInetAddress734 = null;
      this.aLong735 = -1645125888039874841L;
      if(this.aString733 != null) {
         try {
            this.anInetAddress734 = InetAddress.getByName(this.aString733);
         } catch (UnknownHostException var3) {
            ;
         }
      }

   }

   public void run() {
      while(this.aBool732) {
         this.method1046((byte)-85);
      }

   }

   void method1046(byte var1) {
      if(null != this.anInetAddress734) {
         try {
            byte[] var2 = this.anInetAddress734.getAddress();
            this.aLong735 = (long)Ping.method579(var2[0], var2[1], var2[2], var2[3], 10000L) * 1645125888039874841L;
         } catch (Throwable var3) {
            ;
         }
      }

      Class304_Sub1.method9089(1000L);
   }

   void method1047(String var1) {
      this.aString733 = var1;
      this.anInetAddress734 = null;
      this.aLong735 = -1645125888039874841L;
      if(this.aString733 != null) {
         try {
            this.anInetAddress734 = InetAddress.getByName(this.aString733);
         } catch (UnknownHostException var3) {
            ;
         }
      }

   }

   void method1048() {
      if(null != this.anInetAddress734) {
         try {
            byte[] var1 = this.anInetAddress734.getAddress();
            this.aLong735 = (long)Ping.method579(var1[0], var1[1], var1[2], var1[3], 10000L) * 1645125888039874841L;
         } catch (Throwable var2) {
            ;
         }
      }

      Class304_Sub1.method9089(1000L);
   }

   long method1049() {
      return this.aLong735 * 2791791504216054569L;
   }

   public void method1050() {
      while(this.aBool732) {
         this.method1046((byte)-9);
      }

   }

   long method1051() {
      return this.aLong735 * 2791791504216054569L;
   }

   void method1052() {
      this.aBool732 = false;
   }

   void method1053() {
      this.aBool732 = false;
   }

   void method1054() {
      this.aBool732 = false;
   }

   void method1055(int var1) {
      this.aBool732 = false;
   }

   public void method1056() {
      while(this.aBool732) {
         this.method1046((byte)-81);
      }

   }

   void method1057(String var1) {
      this.aString733 = var1;
      this.anInetAddress734 = null;
      this.aLong735 = -1645125888039874841L;
      if(this.aString733 != null) {
         try {
            this.anInetAddress734 = InetAddress.getByName(this.aString733);
         } catch (UnknownHostException var3) {
            ;
         }
      }

   }

   void method1058() {
      if(null != this.anInetAddress734) {
         try {
            byte[] var1 = this.anInetAddress734.getAddress();
            this.aLong735 = (long)Ping.method579(var1[0], var1[1], var1[2], var1[3], 10000L) * 1645125888039874841L;
         } catch (Throwable var2) {
            ;
         }
      }

      Class304_Sub1.method9089(1000L);
   }

   void method1059() {
      if(null != this.anInetAddress734) {
         try {
            byte[] var1 = this.anInetAddress734.getAddress();
            this.aLong735 = (long)Ping.method579(var1[0], var1[1], var1[2], var1[3], 10000L) * 1645125888039874841L;
         } catch (Throwable var2) {
            ;
         }
      }

      Class304_Sub1.method9089(1000L);
   }

   static final void method1060(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + var0.anInt8623 * -1730576285];
      int var4 = client.aClass492ArrayArray11265[var3][var2].method5878((byte)89);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 0 == var4?1:0;
   }
}
