package com.jagex;

import com.jagex.Class115;
import com.jagex.Class164;
import com.jagex.OutFrame;
import com.jagex.Class526_Sub23_Sub1;
import com.jagex.OutFrameBuffer;
import com.jagex.Class639_Sub1;
import com.jagex.Class681;
import com.jagex.Interface65;
import com.jagex.client;

public class Class584 implements Interface65 {
   static int[] anIntArray7784;
   int anInt7783;

   Class584(int var1) {
      this.anInt7783 = var1 * -705023523;
   }

   public void method140() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4198, client.aClass111_11060.aClass14_1342, -1077801322);
      var1.out.writeLEShort(this.anInt7783 * 1092595317, (byte)0);
      client.aClass111_11060.write(var1, (byte)40);
   }

   public void method298() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4198, client.aClass111_11060.aClass14_1342, 132072417);
      var1.out.writeLEShort(this.anInt7783 * 1092595317, (byte)0);
      client.aClass111_11060.write(var1, (byte)-71);
   }

   public void method228(int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4198, client.aClass111_11060.aClass14_1342, 2108210791);
      var2.out.writeLEShort(this.anInt7783 * 1092595317, (byte)0);
      client.aClass111_11060.write(var2, (byte)-42);
   }

   static final void method6985(Class639_Sub1 var0, Class681 var1, byte var2) {
      boolean var3 = false;
      int var4 = 0;
      int var5 = 0;
      int var6 = 0;
      int var7 = 0;
      if(var0.aClass164Array10829 != null) {
         for(int var8 = 0; var8 < var0.aClass164Array10829.length; ++var8) {
            Class164 var9 = var0.aClass164Array10829[var8];
            if(var9.aBool1784) {
               int var10;
               int var11;
               if(var9.anInt1785 < var9.anInt1789) {
                  var10 = var9.anInt1785 - var9.anInt1787;
                  var11 = var9.anInt1787 + var9.anInt1789;
               } else {
                  var10 = var9.anInt1789 - var9.anInt1787;
                  var11 = var9.anInt1785 + var9.anInt1787;
               }

               int var12;
               int var13;
               if(var9.anInt1788 < var9.anInt1786) {
                  var12 = var9.anInt1788 - var9.anInt1787;
                  var13 = var9.anInt1786 + var9.anInt1787;
               } else {
                  var12 = var9.anInt1786 - var9.anInt1787;
                  var13 = var9.anInt1787 + var9.anInt1788;
               }

               if(!var3 || var10 < var4) {
                  var4 = var10;
               }

               if(!var3 || var12 < var5) {
                  var5 = var12;
               }

               if(!var3 || var11 > var6) {
                  var6 = var11;
               }

               if(!var3 || var13 > var7) {
                  var7 = var13;
               }

               var3 = true;
            }
         }
      }

      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var3?1:0;
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var4;
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var5;
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var6;
      var1.anIntArray8622[(var1.anInt8623 += -1957887669) * -1730576285 - 1] = var7;
   }

   public static void method6986(int var0, int var1) {
      Class526_Sub23_Sub1.method10562(var0, (byte)-27);
   }
}
