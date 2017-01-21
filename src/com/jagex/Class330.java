package com.jagex;

import com.jagex.Class26;
import com.jagex.Class29;
import com.jagex.Class31;
import com.jagex.Class328;
import com.jagex.Class440;
import com.jagex.Class446;
import com.jagex.Class516;
import com.jagex.Class521;
import com.jagex.Class566;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.client;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

public class Class330 implements Runnable {
   volatile boolean aBool3493;
   Class328[] aClass328Array3495;
   Thread aThread3494;

   Class328 method4233(int var1, byte var2) {
      return this.aClass328Array3495 != null && var1 >= 0 && var1 < this.aClass328Array3495.length?this.aClass328Array3495[var1]:null;
   }

   public void run() {
      try {
         int var1 = Class29.method735(Class521.aClass684_7051, Class667.aClass667_8530, -2107114137 * Class516.aClass6_7036.id, (byte)7);
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class516.aClass6_7036.address + ":" + var1 + "/news.ws?game=" + client.aClass676_11127.anInt8593 * -767001605)).openStream())));
         String var3 = var2.readLine();

         ArrayList var4;
         for(var4 = new ArrayList(); var3 != null; var3 = var2.readLine()) {
            var4.add(var3);
         }

         String[] var5 = new String[var4.size()];
         var4.toArray(var5);
         if(var5.length % 3 != 0) {
            return;
         }

         this.aClass328Array3495 = new Class328[var5.length / 3];

         for(int var6 = 0; var6 < var5.length; var6 += 3) {
            this.aClass328Array3495[var6 / 3] = new Class328(var5[var6], var5[1 + var6], var5[var6 + 2]);
         }
      } catch (IOException var7) {
         ;
      }

      this.aBool3493 = true;
   }

   public void method4234() {
      try {
         int var1 = Class29.method735(Class521.aClass684_7051, Class667.aClass667_8530, -2107114137 * Class516.aClass6_7036.id, (byte)7);
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class516.aClass6_7036.address + ":" + var1 + "/news.ws?game=" + client.aClass676_11127.anInt8593 * -767001605)).openStream())));
         String var3 = var2.readLine();

         ArrayList var4;
         for(var4 = new ArrayList(); var3 != null; var3 = var2.readLine()) {
            var4.add(var3);
         }

         String[] var5 = new String[var4.size()];
         var4.toArray(var5);
         if(var5.length % 3 != 0) {
            return;
         }

         this.aClass328Array3495 = new Class328[var5.length / 3];

         for(int var6 = 0; var6 < var5.length; var6 += 3) {
            this.aClass328Array3495[var6 / 3] = new Class328(var5[var6], var5[1 + var6], var5[var6 + 2]);
         }
      } catch (IOException var7) {
         ;
      }

      this.aBool3493 = true;
   }

   public void method4235() {
      try {
         int var1 = Class29.method735(Class521.aClass684_7051, Class667.aClass667_8530, -2107114137 * Class516.aClass6_7036.id, (byte)7);
         BufferedReader var2 = new BufferedReader(new InputStreamReader(new DataInputStream((new URL("http://" + Class516.aClass6_7036.address + ":" + var1 + "/news.ws?game=" + client.aClass676_11127.anInt8593 * -767001605)).openStream())));
         String var3 = var2.readLine();

         ArrayList var4;
         for(var4 = new ArrayList(); var3 != null; var3 = var2.readLine()) {
            var4.add(var3);
         }

         String[] var5 = new String[var4.size()];
         var4.toArray(var5);
         if(var5.length % 3 != 0) {
            return;
         }

         this.aClass328Array3495 = new Class328[var5.length / 3];

         for(int var6 = 0; var6 < var5.length; var6 += 3) {
            this.aClass328Array3495[var6 / 3] = new Class328(var5[var6], var5[1 + var6], var5[var6 + 2]);
         }
      } catch (IOException var7) {
         ;
      }

      this.aBool3493 = true;
   }

   boolean method4236() {
      if(this.aBool3493) {
         return true;
      } else {
         if(this.aThread3494 == null) {
            this.aThread3494 = new Thread(this);
            this.aThread3494.start();
         }

         return this.aBool3493;
      }
   }

   boolean method4237() {
      if(this.aBool3493) {
         return true;
      } else {
         if(this.aThread3494 == null) {
            this.aThread3494 = new Thread(this);
            this.aThread3494.start();
         }

         return this.aBool3493;
      }
   }

   boolean method4238(byte var1) {
      if(this.aBool3493) {
         return true;
      } else {
         if(this.aThread3494 == null) {
            this.aThread3494 = new Thread(this);
            this.aThread3494.start();
         }

         return this.aBool3493;
      }
   }

   static final void method4239(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class26.aClass673_247.getId();
   }

   public static float method4240(Class440 var0, byte var1) {
      Class446 var2 = Class446.method5309(0.0F, 0.0F, 1.0F);
      var2.method5286(var0);
      double var3 = Math.atan2((double)var2.aFloat4917, (double)var2.aFloat4919);
      var2.method5278();
      if(var3 < 0.0D) {
         var3 = 3.141592653589793D + var3 + 3.141592653589793D;
      }

      return (float)var3;
   }

   static final void method4241(Class681 var0, int var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = Class566.aClass223_7610.method3108(1691615210).size();
   }

   static boolean method4242(int var0) {
      return 1600532433 * Class31.anInt273 > 0;
   }
}
