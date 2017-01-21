package com.jagex;

import com.jagex.Class115;
import com.jagex.Class230;
import com.jagex.Class243;
import com.jagex.InterfaceDef;
import com.jagex.OutFrame;
import com.jagex.Class522;
import com.jagex.Class526_Sub21_Sub2;
import com.jagex.OutFrameBuffer;
import com.jagex.Class57;
import com.jagex.Class679;
import com.jagex.Class68;
import com.jagex.Class681;
import com.jagex.Class709;
import com.jagex.Interface65;
import com.jagex.client;

public class Class576 implements Interface65 {
   public static int anInt7740;
   Class68 aClass68_7739;

   Class576(Class68 var1) {
      this.aClass68_7739 = var1;
   }

   public void method228(int var1) {
      OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4240, client.aClass111_11060.aClass14_1342, 724100391);
      var2.out.write128Byte(this.aClass68_7739.getId(), (byte)17);
      client.aClass111_11060.write(var2, (byte)-91);
   }

   public void method298() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4240, client.aClass111_11060.aClass14_1342, -105515624);
      var1.out.write128Byte(this.aClass68_7739.getId(), (byte)26);
      client.aClass111_11060.write(var1, (byte)-13);
   }

   public void method140() {
      OutFrameBuffer var1 = Class115.method1414(OutFrame.aClass405_4240, client.aClass111_11060.aClass14_1342, 991083420);
      var1.out.write128Byte(this.aClass68_7739.getId(), (byte)-46);
      client.aClass111_11060.write(var1, (byte)-81);
   }

   static final void method6937(Class681 var0, byte var1) {
      Class679 var2 = var0.aBool8628?var0.aClass679_8631:var0.aClass679_8621;
      InterfaceDef var3 = var2.aClass245_8600;
      Class243 var4 = var2.aClass243_8599;
      Class526_Sub21_Sub2.method10419(var3, var4, var0, -881748522);
   }

   static final void method6938(Class681 var0, byte var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      if(var2 >= 1 && var2 <= 2) {
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub7_10637, var2, (short)-30417);
         Class230.preferences.method9602(Class230.preferences.aClass711_Sub7_10636, var2, (short)-17672);
         Class522.method6257(-1042127423);
      }
   }

   public static void method6939(String var0, int var1) {
      if(client.anInt11038 * -558705405 == 11) {
         OutFrameBuffer var2 = Class115.method1414(OutFrame.aClass405_4256, client.aClass111_11059.aClass14_1342, 31975642);
         var2.out.writeShort(0, -805078716);
         int var3 = var2.out.pos * 301018015;
         var2.out.method9616(var0, 314082058);
         var2.out.pos += 1318867609;
         var2.out.method9622(Class57.anIntArray685, var3, var2.out.pos * 301018015, (short)768);
         var2.out.method9620(301018015 * var2.out.pos - var3, (byte)-1);
         client.aClass111_11059.write(var2, (byte)93);
         Class57.aClass709_688 = Class709.aClass709_8844;
      }
   }
}
