package com.jagex;

import com.jagex.Class108;
import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class153;
import com.jagex.InterfaceDef;
import com.jagex.OutFrame;
import com.jagex.OutFrameBuffer;
import com.jagex.Class554;
import com.jagex.Class570;
import com.jagex.Class681;
import com.jagex.Class94;
import com.jagex.Class97_Sub1_Sub1;
import com.jagex.client;
import java.io.IOException;

public class Class506 {
   static String[] aStringArray5696;
   public static Class153 aClass153_5697;
   public static Class97_Sub1_Sub1 aClass97_Sub1_Sub1_5698;

   public static void method6133(boolean var0) {
      Class570.aClass231_7657.method3190((byte)-20);
      if(Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
         Class111[] var1 = client.aClass111Array11061;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class111 var3 = var1[var2];
            var3.anInt1345 += 1298387453;
            if(-2003594411 * var3.anInt1345 < 50 && !var0) {
               return;
            }

            var3.anInt1345 = 0;
            if(!var3.aBool1346 && var3.method1364(-1184311292) != null) {
               OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4282, var3.aClass14_1342, -429088493);
               var3.write(var4, (byte)12);

               try {
                  var3.method1365((byte)-72);
               } catch (IOException var6) {
                  var3.aBool1346 = true;
               }
            }
         }

         Class570.aClass231_7657.method3190((byte)-98);
      }
   }

   Class506() throws Throwable {
      throw new Error();
   }

   public static void method6134(boolean var0) {
      Class570.aClass231_7657.method3190((byte)-8);
      if(Class108.method1349(client.anInt11038 * -558705405, -1728513157)) {
         Class111[] var1 = client.aClass111Array11061;

         for(int var2 = 0; var2 < var1.length; ++var2) {
            Class111 var3 = var1[var2];
            var3.anInt1345 += 1298387453;
            if(-2003594411 * var3.anInt1345 < 50 && !var0) {
               return;
            }

            var3.anInt1345 = 0;
            if(!var3.aBool1346 && var3.method1364(-1184311292) != null) {
               OutFrameBuffer var4 = Class115.method1414(OutFrame.aClass405_4282, var3.aClass14_1342, -703857135);
               var3.write(var4, (byte)-19);

               try {
                  var3.method1365((byte)-79);
               } catch (IOException var6) {
                  var3.aBool1346 = true;
               }
            }
         }

         Class570.aClass231_7657.method3190((byte)-46);
      }
   }

   static final void method6135(Class681 var0, byte var1) {
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = -1834121477 * client.anInt11190;
   }

   public static final void method6136(byte var0) {
      if(!client.aBool11108) {
         client.aFloat10992 += (-12.0F - client.aFloat10992) / 2.0F;
         client.aBool11070 = true;
         client.aBool11108 = true;
      }
   }

   static void method6137(InterfaceDef var0, byte var1) {
      if(5 == var0.type * -449120703 && -77845371 * var0.componentItem != -1) {
         Class94.method1275(Class554.aClass174_7475, var0, 2059211055);
      }

   }
}
