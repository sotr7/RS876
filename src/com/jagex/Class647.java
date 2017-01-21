package com.jagex;

import com.jagex.Class115;
import com.jagex.OutFrame;
import com.jagex.Class52;
import com.jagex.OutFrameBuffer;
import com.jagex.Class620;
import com.jagex.Class657;
import com.jagex.Class661;
import com.jagex.Class681;
import com.jagex.Class702;
import com.jagex.client;
import jaclib.ping.Ping;
import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

public class Class647 implements Runnable {
   Thread aThread8452 = new Thread(this);
   Object anObject8453 = new Object();
   Queue aQueue8454 = new LinkedList();

   public void method7693() {
      if(this.aThread8452 != null) {
         this.method7695(this.anObject8453, -2003736183);

         try {
            this.aThread8452.join();
         } catch (InterruptedException var2) {
            ;
         }

         this.aThread8452 = null;
      }
   }

   public void method7694(int var1) {
      if(this.aThread8452 != null) {
         this.method7695(this.anObject8453, -2004498708);

         try {
            this.aThread8452.join();
         } catch (InterruptedException var3) {
            ;
         }

         this.aThread8452 = null;
      }
   }

   void method7695(Object var1, int var2) {
      Queue var3 = this.aQueue8454;
      synchronized(var3) {
         this.aQueue8454.add(var1);
         this.aQueue8454.notify();
      }
   }

   public void run() {
      while(true) {
         Queue var1 = this.aQueue8454;
         Class657 var4;
         synchronized(var1) {
            Object var2;
            for(var2 = this.aQueue8454.poll(); var2 == null; var2 = this.aQueue8454.poll()) {
               try {
                  this.aQueue8454.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }

            if(var2 == this.anObject8453) {
               return;
            }

            var4 = (Class657)var2;
         }

         int var9;
         try {
            byte[] var10 = InetAddress.getByName(var4.aString8490).getAddress();
            var9 = Ping.method579(var10[0], var10[1], var10[2], var10[3], 1000L);
         } catch (Throwable var6) {
            var9 = 1000;
         }

         var4.anInt8491 = var9 * 932237867;
      }
   }

   public Class657 method7696(String var1, byte var2) {
      if(null == this.aThread8452) {
         throw new IllegalStateException("");
      } else if(var1 == null) {
         throw new IllegalArgumentException("");
      } else {
         Class657 var3 = new Class657(var1);
         this.method7695(var3, -1912591258);
         return var3;
      }
   }

   public void method7697() {
      while(true) {
         Queue var1 = this.aQueue8454;
         Class657 var4;
         synchronized(var1) {
            Object var2;
            for(var2 = this.aQueue8454.poll(); var2 == null; var2 = this.aQueue8454.poll()) {
               try {
                  this.aQueue8454.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }

            if(var2 == this.anObject8453) {
               return;
            }

            var4 = (Class657)var2;
         }

         int var9;
         try {
            byte[] var10 = InetAddress.getByName(var4.aString8490).getAddress();
            var9 = Ping.method579(var10[0], var10[1], var10[2], var10[3], 1000L);
         } catch (Throwable var6) {
            var9 = 1000;
         }

         var4.anInt8491 = var9 * 932237867;
      }
   }

   public void method7698() {
      while(true) {
         Queue var1 = this.aQueue8454;
         Class657 var4;
         synchronized(var1) {
            Object var2;
            for(var2 = this.aQueue8454.poll(); var2 == null; var2 = this.aQueue8454.poll()) {
               try {
                  this.aQueue8454.wait();
               } catch (InterruptedException var7) {
                  ;
               }
            }

            if(var2 == this.anObject8453) {
               return;
            }

            var4 = (Class657)var2;
         }

         int var9;
         try {
            byte[] var10 = InetAddress.getByName(var4.aString8490).getAddress();
            var9 = Ping.method579(var10[0], var10[1], var10[2], var10[3], 1000L);
         } catch (Throwable var6) {
            var9 = 1000;
         }

         var4.anInt8491 = var9 * 932237867;
      }
   }

   public Class647() {
      this.aThread8452.setDaemon(true);
      this.aThread8452.start();
   }

   static final void method7699(Class681 var0, int var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 | 1 << var3;
   }

   static final void method7700(Class681 var0, int var1) {
      String var2 = (String)var0.anObjectArray8624[(var0.anInt8625 -= 2019513325) * 540934629];
      int var3 = 0;
      if(Class620.method7346(var2, -411939751)) {
         var3 = Class661.method7925(var2, (byte)10);
      }

      OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4244, client.aClass111_11060.aClass14_1342, 259439456);
      var4.out.writeInt(var3, -357564953);
      client.aClass111_11060.write(var4, (byte)-37);
   }

   public static void method7701(byte var0) {
      Class52.aClass702_664 = new Class702();
   }

   static final void method7702(Class681 var0, byte var1) {
      int var2 = client.anIntArrayArrayArray11100[var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285]].length >> 1;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2;
   }
}
