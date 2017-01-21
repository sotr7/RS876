package com.jagex;

import com.jagex.Class108;
import com.jagex.Class152;
import com.jagex.Class153;
import com.jagex.Class172;
import com.jagex.Class196;
import com.jagex.Class230;
import com.jagex.Class242;
import com.jagex.Class259;
import com.jagex.Class265;
import com.jagex.Class325;
import com.jagex.Class332;
import com.jagex.Class342;
import com.jagex.Class380_Sub3;
import com.jagex.Class385;
import com.jagex.Class425;
import com.jagex.Class452_Sub4;
import com.jagex.Class466;
import com.jagex.Class474;
import com.jagex.Class521;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub9;
import com.jagex.Class526_Sub24;
import com.jagex.Class529;
import com.jagex.Class554;
import com.jagex.Class557;
import com.jagex.Class566;
import com.jagex.Class586;
import com.jagex.Class610;
import com.jagex.NPCDirection;
import com.jagex.Class684;
import com.jagex.Class710;
import com.jagex.client;
import java.awt.Container;
import java.awt.Insets;

public class Class325_Sub3 extends Class325 {
   Class153 aClass153_10111;
   Class153 aClass153_10110;
   Class153 aClass153_10112;
   Class153 aClass153_10114;
   Class153 aClass153_10113;
   Class153 aClass153_10109;

   void method4172(boolean var1, int var2, int var3) {
      int var4 = var2 + this.aClass153_10112.method21();
      int var5 = var2 + this.aClass380_3471.anInt3936 * -219376461 - this.aClass153_10114.method21();
      int var6 = var3 + this.aClass153_10113.method1788();
      int var7 = var3 + 874500417 * this.aClass380_3471.anInt3933 - this.aClass153_10109.method1788();
      int var8 = var5 - var4;
      int var9 = var7 - var6;
      int var10 = this.method4169((byte)-84) * var8 / 10000;
      int[] var11 = new int[4];
      Class554.aClass174_7475.method2282(var11);
      Class554.aClass174_7475.method2538(var4, var6, var4 + var10, var7);
      this.method9128(var4, var6, var8, var9, 648911545);
      Class554.aClass174_7475.method2538(var10 + var4, var6, var5, var7);
      this.aClass153_10110.method1783(var4, var6, var8, var9);
      Class554.aClass174_7475.method2538(var11[0], var11[1], var11[2], var11[3]);
   }

   public boolean method232() {
      if(!super.method227((short)260)) {
         return false;
      } else {
         Class380_Sub3 var1 = (Class380_Sub3)this.aClass380_3471;
         return !this.aClass466_3474.method5537(var1.anInt10254 * -1434136933, (byte)103)?false:(!this.aClass466_3474.method5537(var1.anInt10258 * -2013088249, (byte)30)?false:(!this.aClass466_3474.method5537(1541748783 * var1.anInt10255, (byte)30)?false:(!this.aClass466_3474.method5537(1033706277 * var1.anInt10256, (byte)94)?false:(!this.aClass466_3474.method5537(-478097183 * var1.anInt10253, (byte)117)?false:this.aClass466_3474.method5537(-226800375 * var1.anInt10257, (byte)79)))));
      }
   }

   public void method228(int var1) {
      super.method228(-1952866159);
      Class380_Sub3 var2 = (Class380_Sub3)this.aClass380_3471;
      this.aClass153_10111 = Class196.method2835(this.aClass466_3474, -1434136933 * var2.anInt10254, (byte)-1);
      this.aClass153_10110 = Class196.method2835(this.aClass466_3474, -2013088249 * var2.anInt10258, (byte)-28);
      this.aClass153_10112 = Class196.method2835(this.aClass466_3474, var2.anInt10255 * 1541748783, (byte)-24);
      this.aClass153_10114 = Class196.method2835(this.aClass466_3474, 1033706277 * var2.anInt10256, (byte)-18);
      this.aClass153_10113 = Class196.method2835(this.aClass466_3474, -478097183 * var2.anInt10253, (byte)-27);
      this.aClass153_10109 = Class196.method2835(this.aClass466_3474, -226800375 * var2.anInt10257, (byte)-102);
   }

   void method4168(boolean var1, int var2, int var3, int var4) {
      int var5 = var2 + this.aClass153_10112.method21();
      int var6 = var2 + this.aClass380_3471.anInt3936 * -219376461 - this.aClass153_10114.method21();
      int var7 = var3 + this.aClass153_10113.method1788();
      int var8 = var3 + 874500417 * this.aClass380_3471.anInt3933 - this.aClass153_10109.method1788();
      int var9 = var6 - var5;
      int var10 = var8 - var7;
      int var11 = this.method4169((byte)55) * var9 / 10000;
      int[] var12 = new int[4];
      Class554.aClass174_7475.method2282(var12);
      Class554.aClass174_7475.method2538(var5, var7, var5 + var11, var8);
      this.method9128(var5, var7, var9, var10, -1495823967);
      Class554.aClass174_7475.method2538(var11 + var5, var7, var6, var8);
      this.aClass153_10110.method1783(var5, var7, var9, var10);
      Class554.aClass174_7475.method2538(var12[0], var12[1], var12[2], var12[3]);
   }

   void method9128(int var1, int var2, int var3, int var4, int var5) {
      this.aClass153_10111.method1783(var1, var2, var3, var4);
   }

   public boolean method227(short var1) {
      if(!super.method227((short)260)) {
         return false;
      } else {
         Class380_Sub3 var2 = (Class380_Sub3)this.aClass380_3471;
         return !this.aClass466_3474.method5537(var2.anInt10254 * -1434136933, (byte)63)?false:(!this.aClass466_3474.method5537(var2.anInt10258 * -2013088249, (byte)109)?false:(!this.aClass466_3474.method5537(1541748783 * var2.anInt10255, (byte)62)?false:(!this.aClass466_3474.method5537(1033706277 * var2.anInt10256, (byte)70)?false:(!this.aClass466_3474.method5537(-478097183 * var2.anInt10253, (byte)106)?false:this.aClass466_3474.method5537(-226800375 * var2.anInt10257, (byte)77)))));
      }
   }

   void method4174(boolean var1, int var2, int var3) {
      if(var1) {
         int[] var4 = new int[4];
         Class554.aClass174_7475.method2282(var4);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, 874500417 * this.aClass380_3471.anInt3933 + var3);
         int var5 = this.aClass153_10112.method21();
         int var6 = this.aClass153_10112.method1788();
         int var7 = this.aClass153_10114.method21();
         int var8 = this.aClass153_10114.method1788();
         this.aClass153_10112.method1778(var2, var3 + (this.aClass380_3471.anInt3933 * 874500417 - var6) / 2);
         this.aClass153_10114.method1778(-219376461 * this.aClass380_3471.anInt3936 + var2 - var7, var3 + (874500417 * this.aClass380_3471.anInt3933 - var8) / 2);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, var3 + this.aClass153_10113.method1788());
         this.aClass153_10113.method1783(var2 + var5, var3, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         int var9 = this.aClass153_10109.method1788();
         Class554.aClass174_7475.method2538(var2, this.aClass380_3471.anInt3933 * 874500417 + var3 - var9, var2 + this.aClass380_3471.anInt3936 * -219376461, this.aClass380_3471.anInt3933 * 874500417 + var3);
         this.aClass153_10109.method1783(var5 + var2, var3 + 874500417 * this.aClass380_3471.anInt3933 - var9, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         Class554.aClass174_7475.method2538(var4[0], var4[1], var4[2], var4[3]);
      }

   }

   void method4170(boolean var1, int var2, int var3) {
      int var4 = var2 + this.aClass153_10112.method21();
      int var5 = var2 + this.aClass380_3471.anInt3936 * -219376461 - this.aClass153_10114.method21();
      int var6 = var3 + this.aClass153_10113.method1788();
      int var7 = var3 + 874500417 * this.aClass380_3471.anInt3933 - this.aClass153_10109.method1788();
      int var8 = var5 - var4;
      int var9 = var7 - var6;
      int var10 = this.method4169((byte)-82) * var8 / 10000;
      int[] var11 = new int[4];
      Class554.aClass174_7475.method2282(var11);
      Class554.aClass174_7475.method2538(var4, var6, var4 + var10, var7);
      this.method9128(var4, var6, var8, var9, 1252230948);
      Class554.aClass174_7475.method2538(var10 + var4, var6, var5, var7);
      this.aClass153_10110.method1783(var4, var6, var8, var9);
      Class554.aClass174_7475.method2538(var11[0], var11[1], var11[2], var11[3]);
   }

   void method4177(boolean var1, int var2, int var3) {
      if(var1) {
         int[] var4 = new int[4];
         Class554.aClass174_7475.method2282(var4);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, 874500417 * this.aClass380_3471.anInt3933 + var3);
         int var5 = this.aClass153_10112.method21();
         int var6 = this.aClass153_10112.method1788();
         int var7 = this.aClass153_10114.method21();
         int var8 = this.aClass153_10114.method1788();
         this.aClass153_10112.method1778(var2, var3 + (this.aClass380_3471.anInt3933 * 874500417 - var6) / 2);
         this.aClass153_10114.method1778(-219376461 * this.aClass380_3471.anInt3936 + var2 - var7, var3 + (874500417 * this.aClass380_3471.anInt3933 - var8) / 2);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, var3 + this.aClass153_10113.method1788());
         this.aClass153_10113.method1783(var2 + var5, var3, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         int var9 = this.aClass153_10109.method1788();
         Class554.aClass174_7475.method2538(var2, this.aClass380_3471.anInt3933 * 874500417 + var3 - var9, var2 + this.aClass380_3471.anInt3936 * -219376461, this.aClass380_3471.anInt3933 * 874500417 + var3);
         this.aClass153_10109.method1783(var5 + var2, var3 + 874500417 * this.aClass380_3471.anInt3933 - var9, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         Class554.aClass174_7475.method2538(var4[0], var4[1], var4[2], var4[3]);
      }

   }

   public void method234() {
      super.method228(-1885915645);
      Class380_Sub3 var1 = (Class380_Sub3)this.aClass380_3471;
      this.aClass153_10111 = Class196.method2835(this.aClass466_3474, -1434136933 * var1.anInt10254, (byte)-1);
      this.aClass153_10110 = Class196.method2835(this.aClass466_3474, -2013088249 * var1.anInt10258, (byte)-43);
      this.aClass153_10112 = Class196.method2835(this.aClass466_3474, var1.anInt10255 * 1541748783, (byte)-123);
      this.aClass153_10114 = Class196.method2835(this.aClass466_3474, 1033706277 * var1.anInt10256, (byte)-59);
      this.aClass153_10113 = Class196.method2835(this.aClass466_3474, -478097183 * var1.anInt10253, (byte)-126);
      this.aClass153_10109 = Class196.method2835(this.aClass466_3474, -226800375 * var1.anInt10257, (byte)-59);
   }

   void method4175(boolean var1, int var2, int var3) {
      int var4 = var2 + this.aClass153_10112.method21();
      int var5 = var2 + this.aClass380_3471.anInt3936 * -219376461 - this.aClass153_10114.method21();
      int var6 = var3 + this.aClass153_10113.method1788();
      int var7 = var3 + 874500417 * this.aClass380_3471.anInt3933 - this.aClass153_10109.method1788();
      int var8 = var5 - var4;
      int var9 = var7 - var6;
      int var10 = this.method4169((byte)60) * var8 / 10000;
      int[] var11 = new int[4];
      Class554.aClass174_7475.method2282(var11);
      Class554.aClass174_7475.method2538(var4, var6, var4 + var10, var7);
      this.method9128(var4, var6, var8, var9, -529591456);
      Class554.aClass174_7475.method2538(var10 + var4, var6, var5, var7);
      this.aClass153_10110.method1783(var4, var6, var8, var9);
      Class554.aClass174_7475.method2538(var11[0], var11[1], var11[2], var11[3]);
   }

   void method9129(int var1, int var2, int var3, int var4) {
      this.aClass153_10111.method1783(var1, var2, var3, var4);
   }

   Class325_Sub3(Class466 var1, Class466 var2, Class380_Sub3 var3) {
      super(var1, var2, var3);
   }

   void method4173(boolean var1, int var2, int var3) {
      if(var1) {
         int[] var4 = new int[4];
         Class554.aClass174_7475.method2282(var4);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, 874500417 * this.aClass380_3471.anInt3933 + var3);
         int var5 = this.aClass153_10112.method21();
         int var6 = this.aClass153_10112.method1788();
         int var7 = this.aClass153_10114.method21();
         int var8 = this.aClass153_10114.method1788();
         this.aClass153_10112.method1778(var2, var3 + (this.aClass380_3471.anInt3933 * 874500417 - var6) / 2);
         this.aClass153_10114.method1778(-219376461 * this.aClass380_3471.anInt3936 + var2 - var7, var3 + (874500417 * this.aClass380_3471.anInt3933 - var8) / 2);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, var3 + this.aClass153_10113.method1788());
         this.aClass153_10113.method1783(var2 + var5, var3, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         int var9 = this.aClass153_10109.method1788();
         Class554.aClass174_7475.method2538(var2, this.aClass380_3471.anInt3933 * 874500417 + var3 - var9, var2 + this.aClass380_3471.anInt3936 * -219376461, this.aClass380_3471.anInt3933 * 874500417 + var3);
         this.aClass153_10109.method1783(var5 + var2, var3 + 874500417 * this.aClass380_3471.anInt3933 - var9, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         Class554.aClass174_7475.method2538(var4[0], var4[1], var4[2], var4[3]);
      }

   }

   void method4176(boolean var1, int var2, int var3) {
      if(var1) {
         int[] var4 = new int[4];
         Class554.aClass174_7475.method2282(var4);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, 874500417 * this.aClass380_3471.anInt3933 + var3);
         int var5 = this.aClass153_10112.method21();
         int var6 = this.aClass153_10112.method1788();
         int var7 = this.aClass153_10114.method21();
         int var8 = this.aClass153_10114.method1788();
         this.aClass153_10112.method1778(var2, var3 + (this.aClass380_3471.anInt3933 * 874500417 - var6) / 2);
         this.aClass153_10114.method1778(-219376461 * this.aClass380_3471.anInt3936 + var2 - var7, var3 + (874500417 * this.aClass380_3471.anInt3933 - var8) / 2);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, var3 + this.aClass153_10113.method1788());
         this.aClass153_10113.method1783(var2 + var5, var3, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         int var9 = this.aClass153_10109.method1788();
         Class554.aClass174_7475.method2538(var2, this.aClass380_3471.anInt3933 * 874500417 + var3 - var9, var2 + this.aClass380_3471.anInt3936 * -219376461, this.aClass380_3471.anInt3933 * 874500417 + var3);
         this.aClass153_10109.method1783(var5 + var2, var3 + 874500417 * this.aClass380_3471.anInt3933 - var9, this.aClass380_3471.anInt3936 * -219376461 - var5 - var7, this.aClass380_3471.anInt3933 * 874500417);
         Class554.aClass174_7475.method2538(var4[0], var4[1], var4[2], var4[3]);
      }

   }

   void method4171(boolean var1, int var2, int var3, int var4) {
      if(var1) {
         int[] var5 = new int[4];
         Class554.aClass174_7475.method2282(var5);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, 874500417 * this.aClass380_3471.anInt3933 + var3);
         int var6 = this.aClass153_10112.method21();
         int var7 = this.aClass153_10112.method1788();
         int var8 = this.aClass153_10114.method21();
         int var9 = this.aClass153_10114.method1788();
         this.aClass153_10112.method1778(var2, var3 + (this.aClass380_3471.anInt3933 * 874500417 - var7) / 2);
         this.aClass153_10114.method1778(-219376461 * this.aClass380_3471.anInt3936 + var2 - var8, var3 + (874500417 * this.aClass380_3471.anInt3933 - var9) / 2);
         Class554.aClass174_7475.method2538(var2, var3, -219376461 * this.aClass380_3471.anInt3936 + var2, var3 + this.aClass153_10113.method1788());
         this.aClass153_10113.method1783(var2 + var6, var3, this.aClass380_3471.anInt3936 * -219376461 - var6 - var8, this.aClass380_3471.anInt3933 * 874500417);
         int var10 = this.aClass153_10109.method1788();
         Class554.aClass174_7475.method2538(var2, this.aClass380_3471.anInt3933 * 874500417 + var3 - var10, var2 + this.aClass380_3471.anInt3936 * -219376461, this.aClass380_3471.anInt3933 * 874500417 + var3);
         this.aClass153_10109.method1783(var6 + var2, var3 + 874500417 * this.aClass380_3471.anInt3933 - var10, this.aClass380_3471.anInt3936 * -219376461 - var6 - var8, this.aClass380_3471.anInt3933 * 874500417);
         Class554.aClass174_7475.method2538(var5[0], var5[1], var5[2], var5[3]);
      }

   }

   public boolean method226() {
      if(!super.method227((short)260)) {
         return false;
      } else {
         Class380_Sub3 var1 = (Class380_Sub3)this.aClass380_3471;
         return !this.aClass466_3474.method5537(var1.anInt10254 * -1434136933, (byte)85)?false:(!this.aClass466_3474.method5537(var1.anInt10258 * -2013088249, (byte)108)?false:(!this.aClass466_3474.method5537(1541748783 * var1.anInt10255, (byte)94)?false:(!this.aClass466_3474.method5537(1033706277 * var1.anInt10256, (byte)96)?false:(!this.aClass466_3474.method5537(-478097183 * var1.anInt10253, (byte)84)?false:this.aClass466_3474.method5537(-226800375 * var1.anInt10257, (byte)74)))));
      }
   }

   void method9130(int var1, int var2, int var3, int var4) {
      this.aClass153_10111.method1783(var1, var2, var3, var4);
   }

   static void method9131(int var0, int var1, int var2, int var3, boolean var4, int var5) {
      if(Class710.aBool8850 && client.aFrame5603 != null && (var1 != 3 || var2 != Class172.anInt2025 * 1450916551 || var3 != client.anInt5601 * -1700839477)) {
         Class610.method7208(Class342.aClass690_3559, client.aFrame5603, -562125503);
         client.aFrame5603 = null;
      }

      if(Class710.aBool8850 && var1 == 3 && null == client.aFrame5603) {
         client.aFrame5603 = Class259.method3522(Class342.aClass690_3559, var2, var3, 0, 0, 1972122597);
         if(null != client.aFrame5603) {
            Class172.anInt2025 = 1171875575 * var2;
            client.anInt5601 = var3 * -1648136733;
            Class522.method6257(-1042127423);
         }
      }

      if(3 == var1 && (!Class710.aBool8850 || null == client.aFrame5603)) {
         method9131(var0, Class230.preferences.aClass711_Sub7_10637.method9899((byte)6), -1, -1, true, 178600896);
      } else {
         Container var6 = Class152.method1757((byte)48);
         Insets var7;
         if(null != client.aFrame5603) {
            Class332.anInt3505 = var2 * -512130579;
            Class586.anInt7792 = -1921704031 * var3;
         } else if(null != Class242.aFrame2454) {
            var7 = Class242.aFrame2454.getInsets();
            int var10001 = var7.left + var7.right;
            Class332.anInt3505 = (Class242.aFrame2454.getSize().width - var10001) * -512130579;
            var10001 = var7.bottom + var7.top;
            Class586.anInt7792 = (Class242.aFrame2454.getSize().height - var10001) * -1921704031;
         } else {
            Class332.anInt3505 = var6.getSize().width * -512130579;
            Class586.anInt7792 = var6.getSize().height * -1921704031;
         }

         if(Class332.anInt3505 * 1405944805 <= 0) {
            Class332.anInt3505 = -512130579;
         }

         if(542147681 * Class586.anInt7792 <= 0) {
            Class586.anInt7792 = -1921704031;
         }

         if(var1 != 1) {
            Class557.method6712((byte)57);
         } else {
            Class566.anInt7611 = -325372039 * client.anInt11229;
            client.anInt5594 = -1896829953 * ((Class332.anInt3505 * 1405944805 - 1969269047 * client.anInt11229) / 2);
            Class526_Sub24.anInt10549 = client.anInt11240 * 1709014387;
            client.anInt5605 = 0;
         }

         if(Class521.aClass684_7051 != Class684.aClass684_8665 && 1895615023 * Class566.anInt7611 < 1024 && 974996221 * Class526_Sub24.anInt10549 < 768) {
            ;
         }

         if(!var4) {
            Class425.aCanvas4798.setSize(Class566.anInt7611 * 1895615023, Class526_Sub24.anInt10549 * 974996221);
            Class554.aClass174_7475.method2253(Class425.aCanvas4798, Class566.anInt7611 * 1895615023, Class526_Sub24.anInt10549 * 974996221, -2014815565);
            if(var6 == Class242.aFrame2454) {
               var7 = Class242.aFrame2454.getInsets();
               Class425.aCanvas4798.setLocation(var7.left + -1115728897 * client.anInt5594, client.anInt5605 * 1208004069 + var7.top);
            } else {
               Class425.aCanvas4798.setLocation(client.anInt5594 * -1115728897, 1208004069 * client.anInt5605);
            }
         } else {
            Class521.method6253(-16777216);
         }

         if(var1 >= 2) {
            client.aBool11020 = true;
         } else {
            client.aBool11020 = false;
         }

         NPCDirection.method7984((byte)52);
         if(-1 != client.anInt11186 * -327748687) {
            Class474.method5652(true, (short)21776);
         }

         if(Class452_Sub4.method9295((byte)67).method1364(-1184311292) != null && (Class108.method1349(client.anInt11038 * -558705405, -1728513157) || Class385.method4746(-558705405 * client.anInt11038, (byte)34))) {
            Class529.method6373(Class452_Sub4.method9295((byte)78), -499421786);
         }

         for(int var8 = 0; var8 < 111; ++var8) {
            client.aBoolArray11236[var8] = true;
         }

         client.aBool5606 = true;
      }
   }

   static void method9132(int var0, int var1, int var2, int var3, int var4) {
      Class526_Sub21_Sub9 var5 = Class265.method3560(20, (long)var1 << 32 | (long)var0);
      var5.method10584(230428369);
      var5.anInt11678 = 1693201951 * var2;
      var5.anInt11680 = var3 * -1482432943;
   }
}
