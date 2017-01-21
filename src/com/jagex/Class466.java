package com.jagex;

import com.jagex.Class113;
import com.jagex.Class234;
import com.jagex.Class238;
import com.jagex.Class448;
import com.jagex.Class457;
import com.jagex.Class460;
import com.jagex.Class462;
import com.jagex.RSByteBuffer;
import com.jagex.Class593;
import com.jagex.Class626;
import com.jagex.Class63;
import com.jagex.Class667;
import com.jagex.Class681;
import com.jagex.Class705;
import com.jagex.Class75;
import com.jagex.client;

public final class Class466 {
   public static final int anInt5327 = 1;
   static final int anInt5328 = 2;
   static final int anInt5329 = 0;
   public static int anInt5334;
   Class462 aClass462_5326 = null;
   Object[] anObjectArray5323;
   Object[][] anObjectArrayArray5331;
   Class448 aClass448_5322;
   boolean aBool5324;
   int anInt5330;
   static Class75 aClass75_5325 = new Class75();
   static boolean aBool5332 = false;
   static int anInt5333 = 0;

   synchronized boolean method5529(byte var1) {
      if(this.aClass462_5326 == null) {
         this.aClass462_5326 = this.aClass448_5322.method5324(1689691978);
         if(this.aClass462_5326 == null) {
            return false;
         }

         this.anObjectArray5323 = new Object[this.aClass462_5326.anInt5215 * 42702579];
         this.anObjectArrayArray5331 = new Object[42702579 * this.aClass462_5326.anInt5215][];
      }

      return true;
   }

   public synchronized boolean method5530(int var1, int var2, int var3) {
      if(!this.validChild(var1, var2, (byte)0)) {
         return false;
      } else if(null != this.anObjectArrayArray5331[var1] && this.anObjectArrayArray5331[var1][var2] != null) {
         return true;
      } else if(this.anObjectArray5323[var1] != null) {
         return true;
      } else {
         this.method5533(var1, -362325066);
         return this.anObjectArray5323[var1] != null;
      }
   }

   synchronized boolean method5531(int var1, int var2) {
      if(!this.method5529((byte)75)) {
         return false;
      } else if(var1 >= 0 && var1 < this.aClass462_5326.anIntArray5226.length && 0 != this.aClass462_5326.anIntArray5226[var1]) {
         return true;
      } else if(aBool5332) {
         throw new IllegalArgumentException(Integer.toString(var1));
      } else {
         return false;
      }
   }

   public synchronized boolean validChild(int var1, int var2, byte var3) {
      if(!this.method5529((byte)58)) {
         return false;
      } else if(var1 >= 0 && var2 >= 0 && var1 < this.aClass462_5326.anIntArray5226.length && var2 < this.aClass462_5326.anIntArray5226[var1]) {
         return true;
      } else if(aBool5332) {
         throw new IllegalArgumentException(var1 + " " + var2);
      } else {
         return false;
      }
   }

   synchronized void method5533(int var1, int var2) {
      if(this.aBool5324) {
         this.anObjectArray5323[var1] = this.aClass448_5322.method5325(var1, (byte)-76);
      } else {
         this.anObjectArray5323[var1] = Class234.method3275(this.aClass448_5322.method5325(var1, (byte)-21), false, -1086064607);
      }

   }

   public void method5534(int var1, int var2) {
      this.aClass448_5322.method5322(var1, -1160026658);
   }

   public synchronized byte[] method5535(int var1, int var2, int[] var3, short var4) {
      if(!this.validChild(var1, var2, (byte)0)) {
         return null;
      } else {
         byte[] var5 = null;
         if(null == this.anObjectArrayArray5331[var1] || null == this.anObjectArrayArray5331[var1][var2]) {
            boolean var6 = this.method5582(var1, var2, var3, (byte)77);
            if(!var6) {
               this.method5533(var1, -920984179);
               var6 = this.method5582(var1, var2, var3, (byte)96);
               if(!var6) {
                  return null;
               }
            }
         }

         if(this.anObjectArrayArray5331[var1] == null) {
            throw new RuntimeException("");
         } else {
            if(null != this.anObjectArrayArray5331[var1][var2]) {
               var5 = Class460.method5464(this.anObjectArrayArray5331[var1][var2], false, 339251717);
               if(null == var5) {
                  throw new RuntimeException("");
               }
            }

            if(var5 != null) {
               if(this.anInt5330 * 859832521 == 1) {
                  this.anObjectArrayArray5331[var1][var2] = null;
                  if(1 == this.aClass462_5326.anIntArray5226[var1]) {
                     this.anObjectArrayArray5331[var1] = null;
                  }
               } else if(859832521 * this.anInt5330 == 2) {
                  this.anObjectArrayArray5331[var1] = null;
               }
            }

            return var5;
         }
      }
   }

   public byte[] method5536(int var1, int var2, byte var3) {
      return this.method5535(var1, var2, (int[])null, (short)-20931);
   }

   public synchronized boolean method5537(int var1, byte var2) {
      if(!this.method5529((byte)96)) {
         return false;
      } else if(1 == this.aClass462_5326.anIntArray5226.length) {
         return this.method5530(0, var1, 1899260968);
      } else if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.aClass462_5326.anIntArray5226[var1] == 1) {
         return this.method5530(var1, 0, 1603213809);
      } else {
         throw new RuntimeException();
      }
   }

   public synchronized boolean method5538(int var1, byte var2) {
      if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.anObjectArray5323[var1] != null) {
         return true;
      } else {
         this.method5533(var1, -1660409830);
         return null != this.anObjectArray5323[var1];
      }
   }

   public synchronized boolean method5539(int var1) {
      if(!this.method5529((byte)71)) {
         return false;
      } else {
         boolean var2 = true;

         for(int var3 = 0; var3 < this.aClass462_5326.anIntArray5221.length; ++var3) {
            int var4 = this.aClass462_5326.anIntArray5221[var3];
            if(null == this.anObjectArray5323[var4]) {
               this.method5533(var4, -1405480058);
               if(null == this.anObjectArray5323[var4]) {
                  var2 = false;
               }
            }
         }

         return var2;
      }
   }

   public synchronized int method5540(int var1, int var2) {
      return !this.method5531(var1, -1644874206)?0:(this.anObjectArray5323[var1] != null?100:this.aClass448_5322.method5326(var1, -1629363788));
   }

   public synchronized byte[] method5541(int var1, int var2) {
      if(!this.method5529((byte)57)) {
         return null;
      } else if(1 == this.aClass462_5326.anIntArray5226.length) {
         return this.method5536(0, var1, (byte)3);
      } else if(!this.method5531(var1, -1644874206)) {
         return null;
      } else if(1 == this.aClass462_5326.anIntArray5226[var1]) {
         return this.method5536(var1, 0, (byte)64);
      } else {
         throw new RuntimeException();
      }
   }

   public synchronized int[] method5542(int var1, byte var2) {
      if(!this.method5531(var1, -1644874206)) {
         return null;
      } else {
         int[] var3 = this.aClass462_5326.anIntArrayArray5223[var1];
         if(null == var3) {
            var3 = new int[this.aClass462_5326.anIntArray5222[var1]];

            for(int var4 = 0; var4 < var3.length; var3[var4] = var4++) {
               ;
            }
         }

         return var3;
      }
   }

   public boolean method5543(int var1, int var2) {
      if(!this.method5529((byte)49)) {
         return false;
      } else if(1 == this.aClass462_5326.anIntArray5226.length) {
         return this.validChild(0, var1, (byte)0);
      } else if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.aClass462_5326.anIntArray5226[var1] == 1) {
         return this.validChild(var1, 0, (byte)0);
      } else {
         throw new RuntimeException();
      }
   }

   public int method5544(int var1, int var2) {
      return !this.method5531(var1, -1644874206)?0:this.aClass462_5326.anIntArray5226[var1];
   }

   public void method5545(boolean var1, boolean var2, int var3) {
      if(this.method5529((byte)80)) {
         if(var1) {
            this.aClass462_5326.anIntArray5213 = null;
            this.aClass462_5326.aClass279_5214 = null;
         }

         if(var2) {
            this.aClass462_5326.anIntArrayArray5218 = (int[][])null;
            this.aClass462_5326.aClass279Array5208 = null;
         }

      }
   }

   public int method5546(String var1, byte var2) {
      if(!this.method5529((byte)35)) {
         return -1;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2121848266), (byte)-79);
         return !this.method5531(var3, -1644874206)?-1:var3;
      }
   }

   public synchronized boolean method5547(int var1) {
      if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.anObjectArray5323[var1] != null) {
         return true;
      } else {
         this.method5533(var1, -1615766510);
         return null != this.anObjectArray5323[var1];
      }
   }

   public boolean method5548(String var1, int var2) {
      if(!this.method5529((byte)14)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2138014340), (byte)-119);
         return var3 >= 0;
      }
   }

   public boolean method5549(String var1, String var2, int var3) {
      if(!this.method5529((byte)106)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2129579521), (byte)-17);
         if(var4 < 0) {
            return false;
         } else {
            int var5 = this.aClass462_5326.aClass279Array5208[var4].method3687(Class626.method7454(var2, 2126494128), (byte)-31);
            return var5 >= 0;
         }
      }
   }

   public synchronized byte[] method5550(String var1, String var2, int var3) {
      if(!this.method5529((byte)60)) {
         return null;
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2113976262), (byte)-88);
         if(!this.method5531(var4, -1644874206)) {
            return null;
         } else {
            int var5 = this.aClass462_5326.aClass279Array5208[var4].method3687(Class626.method7454(var2, 2118192301), (byte)6);
            return this.method5536(var4, var5, (byte)54);
         }
      }
   }

   public Class466(Class448 var1, boolean var2, int var3) {
      if(var3 >= 0 && var3 <= 2) {
         this.aClass448_5322 = var1;
         this.aBool5324 = var2;
         this.anInt5330 = 1934367097 * var3;
      } else {
         throw new IllegalArgumentException("");
      }
   }

   public boolean method5551(String var1, int var2) {
      int var3 = this.method5546("", (byte)4);
      return -1 != var3?this.method5570("", var1, 132530777):this.method5570(var1, "", 1201636706);
   }

   public boolean method5552(String var1, byte var2) {
      if(!this.method5529((byte)30)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2125614403), (byte)-70);
         return this.method5538(var3, (byte)3);
      }
   }

   public int method5553(String var1, int var2) {
      if(!this.method5529((byte)122)) {
         return 0;
      } else {
         var1 = var1.toLowerCase();
         int var3 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2121475261), (byte)-69);
         return this.method5540(var3, 876587427);
      }
   }

   public int method5554(byte var1) {
      if(!this.method5529((byte)11)) {
         throw new IllegalStateException("");
      } else {
         return this.aClass462_5326.anInt5216 * 1234855921;
      }
   }

   synchronized boolean method5555() {
      if(this.aClass462_5326 == null) {
         this.aClass462_5326 = this.aClass448_5322.method5324(1722570447);
         if(this.aClass462_5326 == null) {
            return false;
         }

         this.anObjectArray5323 = new Object[this.aClass462_5326.anInt5215 * 42702579];
         this.anObjectArrayArray5331 = new Object[42702579 * this.aClass462_5326.anInt5215][];
      }

      return true;
   }

   public synchronized boolean method5556() {
      if(!this.method5529((byte)26)) {
         return false;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aClass462_5326.anIntArray5221.length; ++var2) {
            int var3 = this.aClass462_5326.anIntArray5221[var2];
            if(null == this.anObjectArray5323[var3]) {
               this.method5533(var3, -292067254);
               if(null == this.anObjectArray5323[var3]) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   synchronized void method5557(int var1) {
      if(this.aBool5324) {
         this.anObjectArray5323[var1] = this.aClass448_5322.method5325(var1, (byte)-28);
      } else {
         this.anObjectArray5323[var1] = Class234.method3275(this.aClass448_5322.method5325(var1, (byte)31), false, 338925621);
      }

   }

   synchronized void method5558(int var1) {
      if(this.aBool5324) {
         this.anObjectArray5323[var1] = this.aClass448_5322.method5325(var1, (byte)43);
      } else {
         this.anObjectArray5323[var1] = Class234.method3275(this.aClass448_5322.method5325(var1, (byte)-72), false, 1180885724);
      }

   }

   public void method5559(int var1) {
      this.aClass448_5322.method5322(var1, 1942126679);
   }

   public void method5560(int var1) {
      this.aClass448_5322.method5322(var1, 506474796);
   }

   public void method5561(int var1) {
      this.aClass448_5322.method5322(var1, -387201941);
   }

   public int method5562() {
      if(!this.method5529((byte)19)) {
         throw new IllegalStateException("");
      } else {
         return this.aClass462_5326.anInt5216 * 1234855921;
      }
   }

   public synchronized void method5563(int var1, int var2) {
      if(this.method5531(var1, -1644874206)) {
         if(null != this.anObjectArrayArray5331) {
            this.anObjectArrayArray5331[var1] = null;
         }

      }
   }

   public synchronized boolean method5564(int var1, int var2) {
      if(!this.validChild(var1, var2, (byte)0)) {
         return false;
      } else if(null != this.anObjectArrayArray5331[var1] && this.anObjectArrayArray5331[var1][var2] != null) {
         return true;
      } else if(this.anObjectArray5323[var1] != null) {
         return true;
      } else {
         this.method5533(var1, -1014506223);
         return this.anObjectArray5323[var1] != null;
      }
   }

   public synchronized boolean method5565(int var1, int var2) {
      if(!this.validChild(var1, var2, (byte)0)) {
         return false;
      } else if(null != this.anObjectArrayArray5331[var1] && this.anObjectArrayArray5331[var1][var2] != null) {
         return true;
      } else if(this.anObjectArray5323[var1] != null) {
         return true;
      } else {
         this.method5533(var1, -1131961);
         return this.anObjectArray5323[var1] != null;
      }
   }

   public synchronized boolean method5566(int var1) {
      if(!this.method5529((byte)80)) {
         return false;
      } else if(1 == this.aClass462_5326.anIntArray5226.length) {
         return this.method5530(0, var1, 2096496192);
      } else if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.aClass462_5326.anIntArray5226[var1] == 1) {
         return this.method5530(var1, 0, 1482476401);
      } else {
         throw new RuntimeException();
      }
   }

   public synchronized int method5567(int var1) {
      if(!this.method5529((byte)66)) {
         return 0;
      } else {
         int var2 = 0;
         int var3 = 0;

         int var4;
         for(var4 = 0; var4 < this.anObjectArray5323.length; ++var4) {
            if(this.aClass462_5326.anIntArray5222[var4] > 0) {
               var2 += 100;
               var3 += this.method5540(var4, 147281739);
            }
         }

         if(var2 == 0) {
            return 100;
         } else {
            var4 = var3 * 100 / var2;
            return var4;
         }
      }
   }

   public synchronized boolean method5568(int var1) {
      if(!this.method5529((byte)108)) {
         return false;
      } else if(1 == this.aClass462_5326.anIntArray5226.length) {
         return this.method5530(0, var1, 2030687418);
      } else if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.aClass462_5326.anIntArray5226[var1] == 1) {
         return this.method5530(var1, 0, 1776517803);
      } else {
         throw new RuntimeException();
      }
   }

   public synchronized boolean method5569(int var1) {
      if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.anObjectArray5323[var1] != null) {
         return true;
      } else {
         this.method5533(var1, -1454264348);
         return null != this.anObjectArray5323[var1];
      }
   }

   boolean method5570(String var1, String var2, int var3) {
      if(!this.method5529((byte)26)) {
         return false;
      } else {
         var1 = var1.toLowerCase();
         var2 = var2.toLowerCase();
         int var4 = this.aClass462_5326.aClass279_5214.method3687(Class626.method7454(var1, 2116425240), (byte)-34);
         if(!this.method5531(var4, -1644874206)) {
            return false;
         } else {
            int var5 = this.aClass462_5326.aClass279Array5208[var4].method3687(Class626.method7454(var2, 2111267031), (byte)-46);
            return this.method5530(var4, var5, 1736456136);
         }
      }
   }

   public synchronized boolean method5571() {
      if(!this.method5529((byte)16)) {
         return false;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aClass462_5326.anIntArray5221.length; ++var2) {
            int var3 = this.aClass462_5326.anIntArray5221[var2];
            if(null == this.anObjectArray5323[var3]) {
               this.method5533(var3, -2124062917);
               if(null == this.anObjectArray5323[var3]) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   public synchronized boolean method5572() {
      if(!this.method5529((byte)29)) {
         return false;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aClass462_5326.anIntArray5221.length; ++var2) {
            int var3 = this.aClass462_5326.anIntArray5221[var2];
            if(null == this.anObjectArray5323[var3]) {
               this.method5533(var3, -387902457);
               if(null == this.anObjectArray5323[var3]) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   public int method5573(int var1) {
      return !this.method5529((byte)66)?-1:this.aClass462_5326.anIntArray5226.length;
   }

   public synchronized int method5574() {
      if(!this.method5529((byte)26)) {
         return 0;
      } else {
         int var1 = 0;
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.anObjectArray5323.length; ++var3) {
            if(this.aClass462_5326.anIntArray5222[var3] > 0) {
               var1 += 100;
               var2 += this.method5540(var3, -1492475424);
            }
         }

         if(var1 == 0) {
            return 100;
         } else {
            var3 = var2 * 100 / var1;
            return var3;
         }
      }
   }

   synchronized boolean method5575() {
      if(this.aClass462_5326 == null) {
         this.aClass462_5326 = this.aClass448_5322.method5324(2111175742);
         if(this.aClass462_5326 == null) {
            return false;
         }

         this.anObjectArray5323 = new Object[this.aClass462_5326.anInt5215 * 42702579];
         this.anObjectArrayArray5331 = new Object[42702579 * this.aClass462_5326.anInt5215][];
      }

      return true;
   }

   public synchronized int method5576() {
      if(!this.method5529((byte)31)) {
         return 0;
      } else {
         int var1 = 0;
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.anObjectArray5323.length; ++var3) {
            if(this.aClass462_5326.anIntArray5222[var3] > 0) {
               var1 += 100;
               var2 += this.method5540(var3, 911476332);
            }
         }

         if(var1 == 0) {
            return 100;
         } else {
            var3 = var2 * 100 / var1;
            return var3;
         }
      }
   }

   public synchronized boolean method5577() {
      if(!this.method5529((byte)109)) {
         return false;
      } else {
         boolean var1 = true;

         for(int var2 = 0; var2 < this.aClass462_5326.anIntArray5221.length; ++var2) {
            int var3 = this.aClass462_5326.anIntArray5221[var2];
            if(null == this.anObjectArray5323[var3]) {
               this.method5533(var3, 11678014);
               if(null == this.anObjectArray5323[var3]) {
                  var1 = false;
               }
            }
         }

         return var1;
      }
   }

   public int method5578() {
      return !this.method5529((byte)80)?-1:this.aClass462_5326.anIntArray5226.length;
   }

   public int method5579() {
      return !this.method5529((byte)119)?-1:this.aClass462_5326.anIntArray5226.length;
   }

   public synchronized boolean method5580(int var1) {
      if(!this.method5529((byte)95)) {
         return false;
      } else if(1 == this.aClass462_5326.anIntArray5226.length) {
         return this.method5530(0, var1, 2129710259);
      } else if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(this.aClass462_5326.anIntArray5226[var1] == 1) {
         return this.method5530(var1, 0, 1334495172);
      } else {
         throw new RuntimeException();
      }
   }

   public int method5581(int var1, int var2) {
      if(!this.method5529((byte)47)) {
         return -1;
      } else {
         int var3 = this.aClass462_5326.aClass279_5214.method3687(var1, (byte)-105);
         return !this.method5531(var3, -1644874206)?-1:var3;
      }
   }

   synchronized boolean method5582(int var1, int var2, int[] var3, byte var4) {
      if(!this.method5531(var1, -1644874206)) {
         return false;
      } else if(null == this.anObjectArray5323[var1]) {
         return false;
      } else {
         int var5 = this.aClass462_5326.anIntArray5222[var1];
         int[] var6 = this.aClass462_5326.anIntArrayArray5223[var1];
         if(null == this.anObjectArrayArray5331[var1]) {
            this.anObjectArrayArray5331[var1] = new Object[this.aClass462_5326.anIntArray5226[var1]];
         }

         Object[] var7 = this.anObjectArrayArray5331[var1];
         boolean var8 = true;

         for(int var9 = 0; var9 < var5; ++var9) {
            int var10;
            if(null == var6) {
               var10 = var9;
            } else {
               var10 = var6[var9];
            }

            if(var7[var10] == null) {
               var8 = false;
               break;
            }
         }

         if(var8) {
            return true;
         } else {
            int var11;
            int var12;
            byte[] var23;
            if(var3 == null || var3[0] == 0 && 0 == var3[1] && var3[2] == 0 && 0 == var3[3]) {
               var23 = Class460.method5464(this.anObjectArray5323[var1], false, 89542833);
            } else {
               var23 = Class460.method5464(this.anObjectArray5323[var1], true, -638841037);
               RSByteBuffer var24 = new RSByteBuffer(var23);
               var11 = var24.readUnsignedByte(-1990583220);
               var12 = var24.readInt((byte)5);
               int var13 = (var11 == Class457.UNCOMPRESSED.getId()?5:9) + var12;
               var24.method9650(var3, 5, var13, 2037076149);
            }

            byte[] var25;
            try {
               var25 = Class667.method7958(var23, -1882631074);
            } catch (RuntimeException var22) {
               throw Class63.method1069(var22, (var3 != null) + " " + var1 + " " + var23.length + " " + Class705.method8290(var23, var23.length, (short)-1165) + " " + Class705.method8290(var23, var23.length - 2, (short)16441) + " " + this.aClass462_5326.anIntArray5224[var1] + " " + this.aClass462_5326.anInt5216 * 1234855921);
            }

            if(this.aBool5324) {
               this.anObjectArray5323[var1] = null;
            }

            if(var5 > 1) {
               int var15;
               int var16;
               int var17;
               int var18;
               int var19;
               RSByteBuffer var26;
               if(2 != 859832521 * this.anInt5330) {
                  var11 = var25.length;
                  --var11;
                  var12 = var25[var11] & 255;
                  var11 -= 4 * var12 * var5;
                  var26 = new RSByteBuffer(var25);
                  int[] var14 = new int[var5];
                  var26.pos = 801976415 * var11;

                  for(var15 = 0; var15 < var12; ++var15) {
                     var16 = 0;

                     for(var17 = 0; var17 < var5; ++var17) {
                        var16 += var26.readInt((byte)5);
                        var14[var17] += var16;
                     }
                  }

                  byte[][] var28 = new byte[var5][];

                  for(var16 = 0; var16 < var5; ++var16) {
                     var28[var16] = new byte[var14[var16]];
                     var14[var16] = 0;
                  }

                  var26.pos = 801976415 * var11;
                  var16 = 0;

                  for(var17 = 0; var17 < var12; ++var17) {
                     var18 = 0;

                     for(var19 = 0; var19 < var5; ++var19) {
                        var18 += var26.readInt((byte)5);
                        System.arraycopy(var25, var16, var28[var19], var14[var19], var18);
                        var14[var19] += var18;
                        var16 += var18;
                     }
                  }

                  for(var17 = 0; var17 < var5; ++var17) {
                     if(var6 == null) {
                        var18 = var17;
                     } else {
                        var18 = var6[var17];
                     }

                     if(859832521 * this.anInt5330 == 0) {
                        var7[var18] = Class234.method3275(var28[var17], false, -1690168556);
                     } else {
                        var7[var18] = var28[var17];
                     }
                  }
               } else {
                  var11 = var25.length;
                  --var11;
                  var12 = var25[var11] & 255;
                  var11 -= 4 * var12 * var5;
                  var26 = new RSByteBuffer(var25);
                  int var27 = 0;
                  var15 = 0;
                  var26.pos = var11 * 801976415;

                  for(var16 = 0; var16 < var12; ++var16) {
                     var17 = 0;

                     for(var18 = 0; var18 < var5; ++var18) {
                        var17 += var26.readInt((byte)5);
                        if(var6 == null) {
                           var19 = var18;
                        } else {
                           var19 = var6[var18];
                        }

                        if(var2 == var19) {
                           var27 += var17;
                           var15 = var19;
                        }
                     }
                  }

                  if(var27 == 0) {
                     return true;
                  }

                  byte[] var29 = new byte[var27];
                  var27 = 0;
                  var26.pos = 801976415 * var11;
                  var17 = 0;

                  for(var18 = 0; var18 < var12; ++var18) {
                     var19 = 0;

                     for(int var20 = 0; var20 < var5; ++var20) {
                        var19 += var26.readInt((byte)5);
                        int var21;
                        if(var6 == null) {
                           var21 = var20;
                        } else {
                           var21 = var6[var20];
                        }

                        if(var21 == var2) {
                           System.arraycopy(var25, var17, var29, var27, var19);
                           var27 += var19;
                        }

                        var17 += var19;
                     }
                  }

                  var7[var15] = var29;
               }
            } else {
               if(var6 == null) {
                  var11 = 0;
               } else {
                  var11 = var6[0];
               }

               if(this.anInt5330 * 859832521 == 0) {
                  var7[var11] = Class234.method3275(var25, false, -1367001880);
               } else {
                  var7[var11] = var25;
               }
            }

            return true;
         }
      }
   }

   public synchronized void method5583(int var1) {
      if(this.method5531(var1, -1644874206)) {
         if(null != this.anObjectArrayArray5331) {
            this.anObjectArrayArray5331[var1] = null;
         }

      }
   }

   public synchronized int method5584() {
      if(!this.method5529((byte)39)) {
         return 0;
      } else {
         int var1 = 0;
         int var2 = 0;

         int var3;
         for(var3 = 0; var3 < this.anObjectArray5323.length; ++var3) {
            if(this.aClass462_5326.anIntArray5222[var3] > 0) {
               var1 += 100;
               var2 += this.method5540(var3, -2041850034);
            }
         }

         if(var1 == 0) {
            return 100;
         } else {
            var3 = var2 * 100 / var1;
            return var3;
         }
      }
   }

   public synchronized void method5585(int var1) {
      if(this.method5531(var1, -1644874206)) {
         if(null != this.anObjectArrayArray5331) {
            this.anObjectArrayArray5331[var1] = null;
         }

      }
   }

   synchronized boolean method5586() {
      if(this.aClass462_5326 == null) {
         this.aClass462_5326 = this.aClass448_5322.method5324(1898336441);
         if(this.aClass462_5326 == null) {
            return false;
         }

         this.anObjectArray5323 = new Object[this.aClass462_5326.anInt5215 * 42702579];
         this.anObjectArrayArray5331 = new Object[42702579 * this.aClass462_5326.anInt5215][];
      }

      return true;
   }

   synchronized boolean method5587() {
      if(this.aClass462_5326 == null) {
         this.aClass462_5326 = this.aClass448_5322.method5324(2024956589);
         if(this.aClass462_5326 == null) {
            return false;
         }

         this.anObjectArray5323 = new Object[this.aClass462_5326.anInt5215 * 42702579];
         this.anObjectArrayArray5331 = new Object[42702579 * this.aClass462_5326.anInt5215][];
      }

      return true;
   }

   static final void method5588(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[-1730576285 * var0.anInt8623];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 1916404175 * client.aClass492ArrayArray11265[var3][var2].anInt5520;
   }

   static final void method5589(Class681 var0, int var1) {
      var0.anInt8623 -= -1578695711;
      Class593.method7032(var0.anIntArray8622[1 + var0.anInt8623 * -1730576285], -2042688399);
   }

   static final void method5590(Class681 var0, byte var1) {
      var0.anInt8623 -= 379191958;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[var0.anInt8623 * -1730576285 + 1];
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = var2 > var3?var2:var3;
   }

   static final void method5591(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class238 var3 = (Class238)Class113.aClass40_Sub6_1371.method89(var2, -1028554791);
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 831231597 * var3.anInt2442;
   }
}
