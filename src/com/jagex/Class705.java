package com.jagex;

import com.jagex.Class115;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.Class29;
import com.jagex.Class378;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.Class679;
import com.jagex.Class681;
import com.jagex.client;

public class Class705 {
   int anInt8827;
   int anInt8825;
   boolean aBool8826;
   boolean aBool8824;
   boolean aBool8828;

   public int method8269() {
      return -1842785149 * this.anInt8825;
   }

   public int method8270(int var1) {
      return 409834345 * this.anInt8827;
   }

   public int method8271(short var1) {
      return -1842785149 * this.anInt8825;
   }

   public boolean method8272(int var1) {
      return this.aBool8826;
   }

   public int method8273() {
      return 409834345 * this.anInt8827;
   }

   public boolean method8274(int var1) {
      return this.aBool8828;
   }

   public boolean method8275() {
      return this.aBool8824;
   }

   public int method8276() {
      return 409834345 * this.anInt8827;
   }

   public int method8277() {
      return 409834345 * this.anInt8827;
   }

   public int method8278() {
      return -1842785149 * this.anInt8825;
   }

   public boolean method8279(byte var1) {
      return this.aBool8824;
   }

   public int method8280() {
      return -1842785149 * this.anInt8825;
   }

   public int method8281() {
      return -1842785149 * this.anInt8825;
   }

   public boolean method8282() {
      return this.aBool8826;
   }

   public boolean method8283() {
      return this.aBool8828;
   }

   public boolean method8284() {
      return this.aBool8826;
   }

   public boolean method8285() {
      return this.aBool8826;
   }

   Class705(int var1, int var2, boolean var3, boolean var4, boolean var5) {
      this.anInt8827 = 914894041 * var1;
      this.anInt8825 = var2 * -345466325;
      this.aBool8826 = var3;
      this.aBool8824 = var4;
      this.aBool8828 = var5;
   }

   public boolean method8286() {
      return this.aBool8828;
   }

   public boolean method8287() {
      return this.aBool8826;
   }

   public boolean method8288() {
      return this.aBool8824;
   }

   static final int method8289(int var0, int var1) {
      int var2 = var0 & 63;
      int var3 = var0 >> 6 & 3;
      if(18 == var2) {
         if(var3 == 0) {
            return 1;
         }

         if(1 == var3) {
            return 2;
         }

         if(var3 == 2) {
            return 4;
         }

         if(3 == var3) {
            return 8;
         }
      } else if(var2 == 19 || var2 == 21) {
         if(0 == var3) {
            return 16;
         }

         if(1 == var3) {
            return 32;
         }

         if(2 == var3) {
            return 64;
         }

         if(var3 == 3) {
            return 128;
         }
      }

      return 0;
   }

   public static int method8290(byte[] var0, int var1, short var2) {
      return Class378.method4702(var0, 0, var1, 1294959918);
   }

   static final void method8291(Class681 var0, int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4163, client.aClass111_11060.aClass14_1342, 1697582075);
      client.aClass111_11060.write(var2, (byte)74);
   }

   static final void method8292(Class681 var0, int var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class29.method733(var3, var4, var0, -1928004496);
   }
}
