package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class25;
import com.jagex.OutFrame;
import com.jagex.Class452_Sub4;
import com.jagex.OutFrameBuffer;
import com.jagex.Class583;
import com.jagex.Class636;
import com.jagex.Class81;
import com.jagex.Interface76;
import com.jagex.client;

public class Class594 implements Interface76 {
   public int anInt7833;
   public int anInt7845;
   public static Class594 aClass594_7822 = new Class594(0, 0);
   public static Class594 aClass594_7836 = new Class594(1, 0);
   public static Class594 aClass594_7823 = new Class594(2, 0);
   public static Class594 aClass594_7824 = new Class594(3, 0);
   public static Class594 aClass594_7844 = new Class594(9, 2);
   public static Class594 aClass594_7826 = new Class594(4, 1);
   public static Class594 aClass594_7827 = new Class594(5, 1);
   public static Class594 aClass594_7835 = new Class594(6, 1);
   public static Class594 aClass594_7821 = new Class594(7, 1);
   public static Class594 aClass594_7830 = new Class594(8, 1);
   static Class594 aClass594_7831 = new Class594(12, 2);
   public static Class594 aClass594_7832 = new Class594(13, 2);
   static Class594 aClass594_7828 = new Class594(14, 2);
   static Class594 aClass594_7834 = new Class594(15, 2);
   static Class594 aClass594_7840 = new Class594(16, 2);
   static Class594 aClass594_7829 = new Class594(17, 2);
   static Class594 aClass594_7837 = new Class594(18, 2);
   static Class594 aClass594_7838 = new Class594(19, 2);
   static Class594 aClass594_7839 = new Class594(20, 2);
   static Class594 aClass594_7825 = new Class594(21, 2);
   public static Class594 aClass594_7841 = new Class594(10, 2);
   public static Class594 aClass594_7842 = new Class594(11, 2);
   public static Class594 aClass594_7843 = new Class594(22, 3);

   Class594(int var1, int var2) {
      this.anInt7833 = var1 * 1394338289;
      this.anInt7845 = 543265695 * var2;
   }

   public static boolean method7034(int var0) {
      return var0 >= -1226971375 * aClass594_7822.anInt7833 && var0 <= aClass594_7824.anInt7833 * -1226971375 || aClass594_7844.anInt7833 * -1226971375 == var0;
   }

   public int method21() {
      return -1226971375 * this.anInt7833;
   }

   public static boolean method7035(int var0) {
      return var0 >= -1226971375 * aClass594_7822.anInt7833 && var0 <= aClass594_7824.anInt7833 * -1226971375 || aClass594_7844.anInt7833 * -1226971375 == var0;
   }

   public int getId() {
      return -1226971375 * this.anInt7833;
   }

   public static boolean method7036(int var0) {
      return var0 >= aClass594_7837.anInt7833 * -1226971375 && var0 <= aClass594_7825.anInt7833 * -1226971375;
   }

   public static boolean method7037(int var0) {
      return var0 >= aClass594_7837.anInt7833 * -1226971375 && var0 <= aClass594_7825.anInt7833 * -1226971375;
   }

   public static boolean method7038(int var0, byte var1) {
      return 16 == var0 || var0 == 7 || 1 == var0 || var0 == 3 || var0 == 11 || var0 == 13 || 5 == var0;
   }

   public static int method7039(String var0, int var1) {
      return var0.length() + 1;
   }

   public static final void method7040(String var0, int var1) {
      if(var0 != null) {
         String var2 = Class81.method1164(var0, Class583.aClass82_7781, (byte)1);
         if(var2 != null) {
            for(int var3 = 0; var3 < client.anInt11218 * -87727903; ++var3) {
               Class25 var4 = client.aClass25Array11169[var3];
               String var5 = var4.aString243;
               String var6 = Class81.method1164(var5, Class583.aClass82_7781, (byte)1);
               if(Class636.method7562(var0, var2, var5, var6, (byte)44)) {
                  client.anInt11218 -= -1316494559;

                  for(int var7 = var3; var7 < client.anInt11218 * -87727903; ++var7) {
                     client.aClass25Array11169[var7] = client.aClass25Array11169[var7 + 1];
                  }

                  client.anInt11246 = 1211622781 * client.anInt11214;
                  Class111 var9 = Class452_Sub4.method9295((byte)125);
                  OutFrameBuffer var8 = Class115.method1414(OutFrame.aClass405_4197, var9.aClass14_1342, -651127455);
                  var8.out.writeByte(method7039(var0, -585981525), 1671022623);
                  var8.out.method9616(var0, -24326789);
                  var9.write(var8, (byte)5);
                  break;
               }
            }

         }
      }
   }
}
