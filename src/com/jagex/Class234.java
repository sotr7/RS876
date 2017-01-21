package com.jagex;

import com.jagex.Class111;
import com.jagex.Class115;
import com.jagex.Class208;
import com.jagex.Class221;
import com.jagex.InterfaceDef;
import com.jagex.Class315_Sub1;
import com.jagex.OutFrame;
import com.jagex.Class439;
import com.jagex.Class451;
import com.jagex.Class526_Sub21_Sub17;
import com.jagex.OutFrameBuffer;
import com.jagex.Class570;
import com.jagex.RenderDef;
import com.jagex.Class581;
import com.jagex.Class620;
import com.jagex.Class622;
import com.jagex.NPC;
import com.jagex.Class680;
import com.jagex.Class681;
import com.jagex.Class97_Sub1_Sub1;
import com.jagex.Interface59;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class Class234 {
   static final String aString2388 = "#";
   static int anInt2389;

   Class234() throws Throwable {
      throw new Error();
   }

   public static int method3271(int var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
      if(1 == (var5 & 1)) {
         int var7 = var3;
         var3 = var4;
         var4 = var7;
      }

      var2 &= 3;
      return 0 == var2?var0:(1 == var2?var1:(var2 == 2?7 - var0 - (var3 - 1):7 - var1 - (var4 - 1)));
   }

   public static void method3272(Class581 var0, int var1, int var2, Interface59 var3, byte var4) {
      Class681 var5 = RenderDef.method6932((byte)-3);
      var5.anInterface59_8636 = var3;
      Class620.method7343(var0, var1, var2, var5, (byte)-100);
      var5.anInterface59_8636 = null;
   }

   static final void method3273(Class681 var0, byte var1) {
      boolean var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285] != 0;
      if(Class451.localPlayer.aClass633_12181 != null) {
         Class451.localPlayer.aClass633_12181.method7498(var2, 1581659435);
      }
   }

   static final void method3274(Class681 var0, byte var1) {
      var0.anInt8623 -= -1578695711;
      Class570.aClass231_7657.method3236(var0.anIntArray8622[-1730576285 * var0.anInt8623], var0.anIntArray8622[-1730576285 * var0.anInt8623 + 1], 877911551);
   }

   public static Object method3275(byte[] var0, boolean var1, int var2) {
      if(null == var0) {
         return null;
      } else if(var0.length > 136) {
         ByteBuffer var3 = ByteBuffer.allocateDirect(var0.length);
         var3.position(0);
         var3.put(var0);
         return var3;
      } else {
         return var1?Arrays.copyOf(var0, var0.length):var0;
      }
   }

   static final void method3276(Class681 var0, int var1) {
      int var2 = var0.anIntArray8622[(var0.anInt8623 -= -1957887669) * -1730576285];
      Class526_Sub21_Sub17 var3 = Class208.method2934((byte)-38);
      if(null != var3) {
         boolean var4 = var3.method10717(var2 >> 28 & 3, var2 >> 14 & 16383, var2 & 16383, Class680.anIntArray8612, -708839143);
         if(var4) {
            Class622.method7359(Class680.anIntArray8612[1], Class680.anIntArray8612[2], (byte)-9);
         }
      }

   }

   static final void method3277(Class681 var0, byte var1) {
      NPC var2 = (NPC)var0.aClass639_Sub1_Sub2_Sub1_8635;
      var0.anIntArray8622[(var0.anInt8623 += -1957887669) * -1730576285 - 1] = 317072451 * var2.combatLevel;
   }

   static final void method3278(Class681 var0, byte var1) {
      var0.anInt8623 -= -1578695711;
      int var2 = var0.anIntArray8622[var0.anInt8623 * -1730576285];
      int var3 = var0.anIntArray8622[1 + -1730576285 * var0.anInt8623];
      int var4 = var0.anIntArray8622[2 + -1730576285 * var0.anInt8623];
      Class221.method3095(var2, (byte)-28);
      Class439.method5155(Class315_Sub1.aClass243Array10033[var2 >>> 16], var2 & '\uffff', var3, var4, var0.aBool8628, var0, (byte)-125);
   }

   static void method3279(Class111 var0, InterfaceDef var1, int var2, int var3, int var4, int var5) {
      OutFrameBuffer var6;
      if(1 == var2) {
         var6 = Class115.method1414(OutFrame.ACTION_BUTTON_1, var0.aClass14_1342, 872575482);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 942628883);
         var0.write(var6, (byte)72);
      }

      if(var2 == 2) {
         var6 = Class115.method1414(OutFrame.aClass405_4235, var0.aClass14_1342, 1298648806);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 1908070882);
         var0.write(var6, (byte)-91);
      }

      if(3 == var2) {
         var6 = Class115.method1414(OutFrame.aClass405_4177, var0.aClass14_1342, 215825574);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 1354789507);
         var0.write(var6, (byte)-74);
      }

      if(var2 == 4) {
         var6 = Class115.method1414(OutFrame.aClass405_4181, var0.aClass14_1342, 1726554620);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 569616433);
         var0.write(var6, (byte)23);
      }

      if(var2 == 5) {
         var6 = Class115.method1414(OutFrame.aClass405_4194, var0.aClass14_1342, 1000019999);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 1136789285);
         var0.write(var6, (byte)4);
      }

      if(var2 == 6) {
         var6 = Class115.method1414(OutFrame.aClass405_4208, var0.aClass14_1342, 394709210);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 806312309);
         var0.write(var6, (byte)42);
      }

      if(var2 == 7) {
         var6 = Class115.method1414(OutFrame.aClass405_4273, var0.aClass14_1342, -2017030822);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, -77845371 * var1.componentItem, 1677775396);
         var0.write(var6, (byte)-4);
      }

      if(8 == var2) {
         var6 = Class115.method1414(OutFrame.aClass405_4199, var0.aClass14_1342, -1758300100);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, var1.componentItem * -77845371, 204914249);
         var0.write(var6, (byte)-51);
      }

      if(9 == var2) {
         var6 = Class115.method1414(OutFrame.aClass405_4186, var0.aClass14_1342, 1204291197);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, var1.componentItem * -77845371, 1024026486);
         var0.write(var6, (byte)32);
      }

      if(var2 == 10) {
         var6 = Class115.method1414(OutFrame.aClass405_4167, var0.aClass14_1342, 1208691701);
         Class97_Sub1_Sub1.writeButtonPacket(var6, var3, var4, var1.componentItem * -77845371, 2001781030);
         var0.write(var6, (byte)-75);
      }

   }
}
